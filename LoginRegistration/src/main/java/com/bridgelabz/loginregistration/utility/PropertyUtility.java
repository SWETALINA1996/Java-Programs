package com.bridgelabz.loginregistration.utility;

import java.io.FileReader;
import java.util.Properties;

public class PropertyUtility 
{
		public static String getProperty(String key)
		{
			String value = null;
			Properties property = new Properties();
			try {
				FileReader readFile = new FileReader("/home/bridgelabz/swetalina/Spring-programs"
						+ "/LoginRegistration/src/main/java/com/bridgelabz/loginregistration/repositories/config.properties");
				property.load(readFile);
				value = property.getProperty(key);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return value;
		}
}
