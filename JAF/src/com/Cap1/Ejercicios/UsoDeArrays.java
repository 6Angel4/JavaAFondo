package com.Cap1.Ejercicios;
import java.util.Scanner;
public class UsoDeArrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//arreglo de 7 elementos de tipo String
		String dias[] = {
				"lunes",
				"martes",
				"miercoles",
				"jueves",
				"viernes",
				"sabado",
				"domingo",
		};
		System.out.print("Ingrese un dia de la semana (numero): ");
		int numero = scanner.nextInt();
		
		//dias.length = 7
		//arreglo [0-6] index del 0 al 6 = 7
		if(numero<dias.length) {
			System.out.println(dias[numero-1]);
		}else{
			System.out.println("Wrong Day...");
		}
	}
}
