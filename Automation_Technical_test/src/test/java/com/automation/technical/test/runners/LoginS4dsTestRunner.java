package com.automation.technical.test.runners;

import static cucumber.api.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features="src/test/resources/feature/web/loginS4ds.feature",
        glue = { "com.automation.technical.test.step_difinitions"},
        snippets = CAMELCASE)
public class LoginS4dsTestRunner {

}
