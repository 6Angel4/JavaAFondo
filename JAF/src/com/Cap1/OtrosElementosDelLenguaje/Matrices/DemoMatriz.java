package com.Cap1.OtrosElementosDelLenguaje.Matrices;

import java.util.Scanner;

public class DemoMatriz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Filas: ");
		int rows = scanner.nextInt();
		System.out.print("Columnas: ");
		int column = scanner.nextInt();
		// random vacio, porque si aqui lo ponemos de una vez, solo se repitira
		// el mismo numero
		int random;

		// matriz de n filas x n columnas
		int matriz[][] = new int[rows][column];

		// Recorrer la matriz para su llenado
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				random = (int) (Math.random() * 10);
				matriz[i][j] = random;
			}
		}

		// Mostrar la matriz
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				// pinta un numero + espacio_tabulador (hasta terminar la filaxcolumna)

				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
