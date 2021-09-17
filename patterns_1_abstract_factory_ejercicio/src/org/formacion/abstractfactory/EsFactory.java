package org.formacion.abstractfactory;

public class EsFactory implements AbstractFactory{


	@Override
	public Preguntas GetPreguntas() { return new PreguntasEs(); }


	@Override
	public Saludos GetSaludos(){return new SaludosEs();}

}
