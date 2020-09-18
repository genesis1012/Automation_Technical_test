package com.automation.technical.test.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class HomePage extends PageObject{
	
	public static final Target ProductosYServicios = Target.the("Productos & Servicios").locatedBy("//*[@id='main-menu']//*[@href='#productosYserviciosPersonas']");
	public static final Target Banikids = Target.the("Banikids").locatedBy("//a[text()='Banikids']");

}
