package com.Cap1.TratamientoDeCadenasDeCaracteres.PosicionDeUnSubstringDentroDeLaCadena;

public class Cadena {
	public static void main(String[] args) {
		String cadena = "Esto es una cadena";
		
		System.out.println(cadena.indexOf("Esto"));
		System.out.println(cadena.lastIndexOf("cadena"));
		System.out.println(cadena.indexOf("o"));
		System.out.println(cadena.indexOf('o'));
		System.out.println(cadena.indexOf("a"));
		System.out.println(cadena.lastIndexOf('a'));
		
		System.out.println("****");
		
		//Arreglo de caracteres
		char[] cadena1 = cadena.toCharArray();
		int i=0;
		for(char letras : cadena1) {
			System.out.println(i+" -> "+letras);
			i++;
		}
		
	}
}
