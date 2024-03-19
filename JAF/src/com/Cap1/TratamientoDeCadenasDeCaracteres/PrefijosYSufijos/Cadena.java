package com.Cap1.TratamientoDeCadenasDeCaracteres.PrefijosYSufijos;

public class Cadena {
	public static void main(String[] args) {
		String cadena = "Un buen libro de Java";
		boolean b1 = cadena.startsWith("Un buen");
		boolean b2 = cadena.startsWith("A");
		boolean b3 = cadena.endsWith("Java");
		boolean b4 = cadena.endsWith("Un buen");

	}
}
