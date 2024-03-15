package com.Cap1.EstructurasDeControl.InputOutput.v1;
/*
 * 1.3.1 Entrada y Salida de datos por consola.
 */

import java.util.Scanner;

public class HolaMundoNombre {

	public static void main(String[] args) {
		// Instancia de clase Scanner
		Scanner scanner = new Scanner(System.in);
		// mensaje para el usuario
		System.out.println("Ingrese su nombre:");
		// leer un valor por teclado
		String nom = scanner.nextLine();

		// Muestra mensaje y valor de nom
		System.out.println("Hola Mundo: " + nom);

	}

}
