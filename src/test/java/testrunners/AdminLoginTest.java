 package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

  @RunWith(Cucumber.class)
  @CucumberOptions(features="featurefiles/Adminlogin.feature",glue="stepdefinitions",dryRun=false,
 
  plugin={"com.cucumber.listener.ExtentCucumberFormatter:reports\\loginresult.html",	  
  "json:reports.json"})
 // plugin = {"com.aventatack.extentreports.cucumber.adapter.ExtentCucumberAdapter"})
public class AdminLoginTest 
{
	

}
