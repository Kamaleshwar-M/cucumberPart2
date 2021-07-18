package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String jsonFile) {
		//File reportDirectory = new File(System.getProperty("user.dir"+"C:\\Users\\kamal\\eclipse-workspace\\Cucumber_adactine"), "AdactionAutomation");		
		Configuration configuration = new Configuration(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports"), "AdactionAutomation");
		configuration.addClassifications("Browser","Chrome Browser");
		configuration.addClassifications("OS","Windows 10");
		configuration.addClassifications("Testing","Regression");
		configuration.addClassifications("Sprint","17");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles,configuration);
		builder.generateReports();
		
	}

}
