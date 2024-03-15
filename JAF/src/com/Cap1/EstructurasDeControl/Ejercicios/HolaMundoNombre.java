package com.Cap1.EstructurasDeControl.Ejercicios;

/*
 * El siguiente programa pide al usuario que ingrese su nombre, edad y altura. Estos
datos deben ingresarse separados por un espacio en blanco. Luego los muestra por
consola
 */
import java.util.Scanner;

public class HolaMundoNombre {
	public static void main(String[] args) {
		// Instancia de la clase (sirve para multiples cosas)
		// instancia de referencia de tipo Scanner, almacena un objeto Scanner
		Scanner scanner = new Scanner(System.in);

		// Pedir el nombre del usuario
		System.out.print("Ingresa tu nombre: ");
		// Almacenar en la variable de referencia nombre
		String nombre = scanner.next();

		// Pedir la edad del usuario
		System.out.print("Ingresa tu edad: ");
		// Almacenar el valor en edad
		int edad = scanner.nextInt();

		// Pedir la altura
		System.out.println("Ingresa tu altura: ");
		// Almacenar el valor en altura
		double altura = scanner.nextDouble();

		// Mostrar todo junto
		System.out.println("Nombre: " + nombre + " Edad: " + edad + " Altura: " + altura);
	}
}
