package com.grupo.exception;

public class DiaSemanaInvalido extends Exception {
	private static final String MENSAJE = "DIA DE SEMANA INVALIDO";
	public DiaSemanaInvalido() {
		super(MENSAJE);
	}
}
