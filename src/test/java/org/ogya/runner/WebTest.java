package org.ogya.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.ogya.steps",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class WebTest extends AbstractTestNGCucumberTests {
}
