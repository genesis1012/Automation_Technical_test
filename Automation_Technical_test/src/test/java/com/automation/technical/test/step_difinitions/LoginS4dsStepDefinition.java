package com.automation.technical.test.step_difinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.automation.technical.test.questions.buscador;
import com.automation.technical.test.tasks.GoTo;
import com.automation.technical.test.tasks.ToSelect;
import com.automation.technical.test.user_interfaces.HomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class LoginS4dsStepDefinition {
	
	@Before
    public void ActorCanBrowseTheWeb() {
		OnStage.setTheStage(new OnlineCast());       
    }
	
	@Given("^I want to write a step with precondition$")
	public void iWantToWriteAStepWithPrecondition() {
		theActorCalled("Client").wasAbleTo(Open.browserOn().the(HomePage.class));
	}

	@When("^I complete action$")
	public void iCompleteAction() {
		theActorInTheSpotlight().attemptsTo(GoTo.Banikids());
		theActorInTheSpotlight().attemptsTo(ToSelect.Banikids());
	}

	@Then("^I validate the outcomes$")
	public void iValidateTheOutcomes() throws Throwable{
		theActorInTheSpotlight().should(
				seeThat("PDF generado es igual", buscador.buscador(), is(equalTo("/wps/wcm/connect/f243ce7e-bf74-43d0-8cb2-86427cc550aa/banistmo_tarifario_junio+2018+final.pdf?MOD=AJPERES&CVID=mqyv2ng")))
				);
	}
}
