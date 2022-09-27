package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	

	public Properties prop = new Properties();
	
		
	public Properties loadConfig() {
	
		System.out.println("executing LoadProperties.....");
		try {
			
			prop = new Properties();
			System.out.println(System.getProperty("user.dir") + "//src//test//resources//Configuration//config.properties");

			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\configuration\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;

	}
	
		
	
}
