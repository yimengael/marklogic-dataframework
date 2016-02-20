package com.yimengael.ml.tools;

import java.util.ArrayList;
import java.util.List;
import com.marklogic.client.DatabaseClient;
import com.marklogic.client.DatabaseClientFactory;

public class MLConnectionPool {

	List<DatabaseClient> availableClient = new ArrayList<DatabaseClient>();

	public MLConnectionPool() {
		super();
		initializeConnectionPool();
	}

	private void initializeConnectionPool() {
		while (!checkIfConnectionPoolIsFull()) {
			availableClient.add(createNewConnectionForPool());
		}
	}

	private boolean checkIfConnectionPoolIsFull() {
		final int MAX_POOL_SIZE = Configuration.getInstance().MAX_CONNECTIONS;
		if (availableClient.size() < MAX_POOL_SIZE) {
			return false;
		}
		return true;
	}

	private DatabaseClient createNewConnectionForPool() {
		Configuration config = Configuration.getInstance();
		try {
			DatabaseClient client = DatabaseClientFactory.newClient(config.MARKLOGIC_DB_HOST, config.MARKLOGIC_DB_PORT,
					config.MARKLOGIC_DB_ADMIN_USER, config.MARKLOGIC_DB_ADMIN_PASSWORD,
					config.MARKLOGIC_DB_AUTHENTICATION_TYPE);
			return client;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public synchronized DatabaseClient getConnectionFromPool() {
		DatabaseClient client = null;
		if (availableClient.size() > 0) {
			client = availableClient.get(0);
			availableClient.remove(0);
		}
		return client;
	}

	public synchronized void returnConnectionToPool(DatabaseClient client) {
		availableClient.add(client);
	}

}
