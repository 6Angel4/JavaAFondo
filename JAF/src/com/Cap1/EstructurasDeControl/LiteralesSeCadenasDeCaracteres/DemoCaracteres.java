package com.Cap1.EstructurasDeControl.LiteralesSeCadenasDeCaracteres;
/*
 * 1.4.6 Literales de cadenas de caracteres
 */
public class DemoCaracteres {
	public static void main(String[] args) {
		//No es lo mismo "A" que 'A'
		for(int i=0;i<5;i++) {
			System.out.println(i+"A");
		}
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.println(i+'A');//Valor ASCII
		}
		
	}
}
