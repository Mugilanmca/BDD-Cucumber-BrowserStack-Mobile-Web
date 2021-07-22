package com.cts.cucumber.zcommon_library;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;


/**
 * Unit test for simple App.
 */
public class Reuable_Global_Common_library{


	private static Properties mobile_properties = null;
	private static Properties global_properties = null;

	public static Properties getMobilePropertyInstance() {
		if (mobile_properties != null) {
			if (mobile_properties.isEmpty()) {
				System.out.println("pMobileSetttings.properties file is empty");
			}
			return mobile_properties;
		}
		try {
			String fileName = "testproperties/pMobileSettings.properties";
			File file = File.createTempFile("pMobileSettings", ".properties");
			InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream(fileName);
			FileUtils.copyInputStreamToFile(in, file);
			FileInputStream inputStream = new FileInputStream(file);
			mobile_properties = new Properties();
			mobile_properties.load(inputStream);
			in.close();
			inputStream.close();
		} catch (Exception e) {
			System.out.println("pMobileSetttings.properties file is can't be accessed");
		}
		return mobile_properties;
	}
	
	public static Properties getGlobalPropertyInstance() {
		if (global_properties != null) {
			if (global_properties.isEmpty()) {
				System.out.println("pGlobalSetttings.properties file is empty");
			}
			return global_properties;
		}
		try {
			String fileName = "testproperties/pGlobalSettings.properties";
			File file = File.createTempFile("pGlobalSettings", ".properties");
			InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream(fileName);
			FileUtils.copyInputStreamToFile(in, file);
			FileInputStream inputStream = new FileInputStream(file);
			global_properties = new Properties();
			global_properties.load(inputStream);
			in.close();
			inputStream.close();
		} catch (Exception e) {
			System.out.println("pGlobalSetttings.properties file is can't be accessed");
		}
		return global_properties;
	}
	

	
	
}
