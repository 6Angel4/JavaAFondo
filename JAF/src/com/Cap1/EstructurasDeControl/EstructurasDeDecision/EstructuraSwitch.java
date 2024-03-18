package com.Cap1.EstructurasDeControl.EstructurasDeDecision;

import java.util.Scanner;

public class EstructuraSwitch {
	/*
	 * No hay variables de clase
	 * No hay variables de instancia
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresar dia (numFormat): ");
		//Variable local #1
		int diaSemana = scanner.nextInt();
		//Variable local #2
		String dia;
		switch (diaSemana) {
		case 1:
			dia = "Lunes";
			break;
		case 2:
			dia = "Martes";
			break;
		case 3:
			dia = "Miercoles";
			break;
		case 4:
			dia = "Jueves";
			break;
		case 5:
			dia = "Viernes";
			break;
		case 6:
			dia = "Sabado";
			break;
		case 7:
			dia = "Domingo";
			break;
		default:
			dia = "Valor no valido";
		}
		System.out.println(dia);
	}
}
