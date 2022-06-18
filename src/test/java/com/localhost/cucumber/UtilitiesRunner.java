package com.localhost.cucumber;
/* 
 Created by Kalpesh Patel
 */

import com.localhost.testbase.TestBase;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/resources/feature",
        tags = "@utilities")
public class UtilitiesRunner extends TestBase {
}
