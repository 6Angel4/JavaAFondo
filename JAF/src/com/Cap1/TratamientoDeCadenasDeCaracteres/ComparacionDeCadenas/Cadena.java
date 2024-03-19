package com.Cap1.TratamientoDeCadenasDeCaracteres.ComparacionDeCadenas;

public class Cadena {
	public static void main(String[] args) {
		//variable de ref = objeto
		String cadena1 = "Hola";
		String cadena2 = new String("Hola");
		String cadena3 = "Hola";

		System.out.println(cadena1.equals(cadena2));// true
		System.out.println(cadena1 == cadena2);// false
		System.out.println(cadena1 == cadena3);// true

		/*
		 * La linea 10 da false, porque no se encuentran los dos objetos en la pool de
		 * Strings (se encuentran en diferentes pools)
		 */
	}
}
