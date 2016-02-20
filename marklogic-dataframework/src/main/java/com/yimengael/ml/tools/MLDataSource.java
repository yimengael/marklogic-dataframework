package com.yimengael.ml.tools;

import com.marklogic.client.DatabaseClient;

public class MLDataSource {

	static MLConnectionPool mlPool = new MLConnectionPool();
	
	public static DatabaseClient getConnection() {
		DatabaseClient client = mlPool.getConnectionFromPool();
		return client;
	}
	
	public static void returnConnection(DatabaseClient client) {
		mlPool.returnConnectionToPool(client);
	}
}
