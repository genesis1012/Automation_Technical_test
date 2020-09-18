package com.automation.technical.test.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Banikids extends PageObject{
	
	public static final Target TasasYTarifas = Target.the("Tasas y tarifas").locatedBy("//*[@id='filialTabs']//*[@href='#tab4']");
	public static final Target TCD = Target.the("Tarifas de Cuentas de Depósitos").locatedBy("//*[@id='tab4']//tr[1]//td[2]/span");
	public static final Target Link = Target.the("Tarifas de Cuentas de Depósitos").located(By.linkText("/wps/wcm/connect/f243ce7e-bf74-43d0-8cb2-86427cc550aa/banistmo_tarifario_junio+2018+final.pdf?MOD=AJPERES&CVID=mqyv2ng"));

}
