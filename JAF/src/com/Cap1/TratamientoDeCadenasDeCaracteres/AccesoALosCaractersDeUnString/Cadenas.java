package com.Cap1.TratamientoDeCadenasDeCaracteres.AccesoALosCaractersDeUnString;

/*
 * 1.5.1 Acceso a los caracteres de un String
 * Una cadena representa una secuencia finita ded cero o mas caracteres
 * numerados a partir de cero.
 */
public class Cadenas {
	public static void main(String[] args) {
		String cadena = "Esto es una cadena";
		System.out.println(cadena.charAt(0));
		System.out.println(cadena.charAt(3));
		System.out.println(cadena.length());// Saber cuantos caracteres se tienen
		System.out.println(cadena.charAt(cadena.length() - 1));
	}
}
