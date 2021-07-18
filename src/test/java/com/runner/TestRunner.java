package com.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources" , glue = {"com.stepdefinition"}, dryRun = false, monochrome = true, plugin = {"json:src\\test\\resources\\Reports\\report.json"})

public class TestRunner {

	 @AfterClass
	 public static void afterClass() {
	 JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\report.json");
	
	 }
}
