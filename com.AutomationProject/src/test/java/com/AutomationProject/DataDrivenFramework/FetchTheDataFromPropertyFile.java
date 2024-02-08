package com.AutomationProject.DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchTheDataFromPropertyFile {
	// method to fetch the data from property file
	public String getDataFromProperty(String Path, String Key) throws IOException {
		FileInputStream fis = new FileInputStream(Path);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(Key);
		return value;

	}

}
