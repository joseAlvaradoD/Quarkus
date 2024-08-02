package org.jjad.quarkus.starting;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

import io.quarkiverse.cucumber.CucumberQuarkusTest;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;


public class RunCucumberQuarkusTest extends CucumberQuarkusTest {

    public static void main(String[] args) {
        runMain(RunCucumberQuarkusTest.class, args);
    }

}
