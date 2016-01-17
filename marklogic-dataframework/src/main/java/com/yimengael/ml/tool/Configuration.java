package com.yimengael.ml.tool;

import com.marklogic.client.DatabaseClientFactory.Authentication;

/**
 * 
 * @author YIMSON
 * @see This class is a Singleton to handle connection pool
 * to MarkLogic database
 * 
 */
public class Configuration {
	
	public String MARKLOGIC_DB_ADMIN_USER;
	public String MARKLOGIC_DB_ADMIN_PASSWORD;
	public String MARKLOGIC_DB_HOST;
	public Integer MARKLOGIC_DB_PORT;
	public Authentication MARKLOGIC_DB_AUTHENTICATION_TYPE;
	public Integer MAX_CONNECTIONS;
	
	public Configuration() {
		super();
		init();
	}

	private static Configuration configuration = new Configuration();
	
	public static Configuration getInstance() {
		return configuration;
	}
	
	private void init(){
		MARKLOGIC_DB_ADMIN_USER = ConfigParameter.admin_user;
		MARKLOGIC_DB_ADMIN_PASSWORD = ConfigParameter.admin_password;
		MARKLOGIC_DB_HOST = ConfigParameter.host;
		MARKLOGIC_DB_PORT = ConfigParameter.port;
		MAX_CONNECTIONS = ConfigParameter.max_connections;
		MARKLOGIC_DB_AUTHENTICATION_TYPE = ConfigParameter.authType;
	}
}
