package org.formacion.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;
import abstractfactory.*;

public class TestMultiIdioma {

	@Test
	public void test_es() {
		//implementar Abstract factory
		AbstractFactory es = new EsFactory();
		Preguntas preguntas = es.GetPreguntas();
		Saludos saludos = es.GetSaludos();

	}
	
	@Test
	public void test_en() {
		//implementar Abstract factor
		AbstractFactory en = new EnFactory();
		Preguntas preguntas = en.GetPreguntas();
		//implementar Abstract factor
		Saludos saludos = en.GetSaludos();
		


	}

}
