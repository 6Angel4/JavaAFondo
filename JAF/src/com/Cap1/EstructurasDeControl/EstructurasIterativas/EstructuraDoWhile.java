package com.Cap1.EstructurasDeControl.EstructurasIterativas;

/*
 * 1.3.5 Estructuras iterativas
 * DoWhile
 * dowhile{
 * accion1:
 * accion2;
 * }while(condicion);   
 * 
 */

public class EstructuraDoWhile {
	public static void main(String[] args) {
		int numero = 20;
		do {
			System.out.println(numero);
			numero--;
		} while (numero >= 0);
	}
}
