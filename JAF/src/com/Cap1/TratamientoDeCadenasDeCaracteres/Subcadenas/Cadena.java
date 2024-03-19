package com.Cap1.TratamientoDeCadenasDeCaracteres.Subcadenas;

public class Cadena {
	public static void main(String[] args) {
		String cadena = "Esto es una cadena";
		String cadena2 = new String("Esto es una cadena");
		String cadena3 = "Esto es una cadena";
		
		String subCadena1 = cadena.substring(1);
		String subCadena2 = cadena.substring(0,5);
		
		System.out.println(subCadena1);
		System.out.println(subCadena2);
		
		System.out.println(cadena.equals(cadena3));
	}
}
