package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Rajvir\\eclipse-workspace\\Cucumber1\\Features", glue = { "stepdefinition" }, plugin = { "html:target",
"json:src/test/java/pack2/report.json" }, tags = {}, monochrome = true, dryRun = false, strict = true)



public class TestRunner {

}
