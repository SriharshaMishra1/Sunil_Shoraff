package com.crm.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

features="C:\\Users\\sriharsha\\eclipse-workspace\\BDDtestCaseExamp\\Features\\contact.feature"
,glue= {"com.crm.stepDefination"}
,dryRun=false
)
public class TestRunner {
	
}
