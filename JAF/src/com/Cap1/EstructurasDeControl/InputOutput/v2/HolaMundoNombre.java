package com.Cap1.EstructurasDeControl.InputOutput.v2;
/*
 * 1.3.1 Entrada y Salida de datos por consola.
 */

import java.util.Scanner;

public class HolaMundoNombre {

	public static void main(String[] args) {
		// Instancia de clase Scanner
		Object scanner = new Scanner(System.in);
		// mensaje para el usuario
		System.out.print("Ingrese su nombre:");
		// Aplicando downcasting
		String nom = ((Scanner) scanner).nextLine();

		// Muestra mensaje y valor de nom
		System.out.println("Hola Mundo: " + nom);

	}

}
