package com.automation.technical.test.questions;

import static com.automation.technical.test.user_interfaces.Banikids.TCD;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class buscador {
	
	public static Question<String> buscador() {
        return actor ->  Text.of(TCD).viewedBy(actor).asString();
    }
	
}
