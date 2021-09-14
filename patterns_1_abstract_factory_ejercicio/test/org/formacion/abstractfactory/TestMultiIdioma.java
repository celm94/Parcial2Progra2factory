package org.formacion.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiIdioma {

	@Test
	public void test_es() {
		//implementar Abstract factory
		Preguntas preguntas = null;
		
		assertEquals("¿qué hora es?", preguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );
		//implementar Abstract factor
		Saludos saludos = null;
		
		assertEquals("buenos días", saludos.buenosDias());
		assertEquals("buenas tardes", saludos.buenasTardes());
	}
	
	@Test
	public void test_en() {
		//implementar Abstract factor
		Preguntas preguntas = null;
		
		assertEquals("what time is it?", preguntas.preguntaHora() );
		assertEquals("how is the weather?", preguntas.preguntaTiempo() );
		
		//implementar Abstract factor
		Saludos saludos = null;
		
		assertEquals("good morning", saludos.buenosDias());
		assertEquals("good afternoon", saludos.buenasTardes());
	}

}
