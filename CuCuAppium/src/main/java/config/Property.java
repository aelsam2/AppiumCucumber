
package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Property {

	Properties prop =new Properties();
	String projPath =System.getProperty("user.dir");
	public static void main(String[] args) throws IOException {

	}
	public  String device() throws IOException {
		InputStream input = new FileInputStream(projPath +"/src/main/java/config/configuration.properties");
		prop.load(input);
		String device=prop.getProperty("device");
		return device;
	}
}

