package com.automation.technical.test.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static com.automation.technical.test.user_interfaces.HomePage.ProductosYServicios;
import static com.automation.technical.test.user_interfaces.HomePage.Banikids;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoTo implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(ProductosYServicios),
				Click.on(Banikids));
	}
	
	public static GoTo Banikids() {
		return instrumented(GoTo.class);
	}

}
