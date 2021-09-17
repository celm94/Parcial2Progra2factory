package org.formacion.abstractfactory;

public class EnFactory implements AbstractFactory{


	@Override
	public Preguntas GetPreguntas() { return new PreguntasEn(); }


	@Override
	public Saludos GetSaludos(){return new SaludosEn();}

}
