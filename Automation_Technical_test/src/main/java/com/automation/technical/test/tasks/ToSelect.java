package com.automation.technical.test.tasks;

import static com.automation.technical.test.user_interfaces.Banikids.TasasYTarifas;
import static com.automation.technical.test.user_interfaces.Banikids.TCD;
import static com.automation.technical.test.user_interfaces.Banikids.Link;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ToSelect implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(TasasYTarifas),
				Click.on(TCD),
				Click.on(Link));
	}
	
	public static ToSelect Banikids() {
		return instrumented(ToSelect.class);
	}

}
