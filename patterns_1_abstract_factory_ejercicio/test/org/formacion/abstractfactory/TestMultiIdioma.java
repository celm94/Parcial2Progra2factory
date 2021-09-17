package org.formacion.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;
import abstractfactory.*;

public class TestMultiIdioma {

	@Test
	public void test_es() {
		//implementar Abstract factory
		Preguntas preguntas = new PreguntasEs();
		
		assertEquals("¿qué hora es?", preguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );
		//implementar Abstract factor
		Saludos saludos = new SaludosEs();
		
		assertEquals("buenos días", saludos.buenosDias());
		assertEquals("buenas tardes", saludos.buenasTardes());
	}
	
	@Test
	public void test_en() {
		//implementar Abstract factor

		Preguntas preguntas = new PreguntasEn();
		
		assertEquals("what time is it?", preguntas.preguntaHora() );
		assertEquals("how is the weather?", preguntas.preguntaTiempo() );
		
		//implementar Abstract factor

		Saludos saludos = new SaludosEn();
		
		assertEquals("good morning", saludos.buenosDias());
		assertEquals("good afternoon", saludos.buenasTardes());
	}

}
