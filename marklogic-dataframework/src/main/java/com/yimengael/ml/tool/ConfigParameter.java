package com.yimengael.ml.tool;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.marklogic.client.DatabaseClientFactory.Authentication;

public class ConfigParameter {

	private static Properties props = loadProperties();

	protected static int max_connections = Integer.parseInt(props.getProperty("marklogic.db.max.connections"));
	protected static int port = Integer.parseInt(props.getProperty("marklogic.db.port"));
	protected static String host = props.getProperty("marklogic.db.host");
	protected static String user = props.getProperty("marklogic.db.writer_user");
	protected static String password = props.getProperty("marklogic.db.writer_password");
	protected static String admin_user = props.getProperty("marklogic.db.admin_user");
	protected static String admin_password = props.getProperty("marklogic.db.admin_password");
	protected static Authentication authType = Authentication
			.valueOf(props.getProperty("marklogic.db.authentication_type").toUpperCase());
	public static String root_path = props.getProperty("marklogic.root.path");
	public static String work_dept_path = props.getProperty("marklogic.workdept.path");
	public static String staff_info_path = props.getProperty("marklogic.staffinformation.path");
	

	
	// get the configuration
	private static Properties loadProperties() {
		try {
			String propsName = "parameters/config.properties";
			InputStream propsStream = ConfigParameter.class.getClassLoader().getResourceAsStream(propsName);
			if (propsStream == null)
				throw new IOException("Could not read config properties");

			Properties props = new Properties();
			props.load(propsStream);

			return props;

		} catch (final IOException exc) {
			throw new Error(exc);
		}
	}
	
	
}
