package com.Cap1.EstructurasDeControl.Constantes;
import java.util.Scanner;
public class DemoConstantes {
	/*
	 * 1.4.3 Definicion de constantes
	 * Que estamos viendo?
	 * 
	 * 7 variables de clase (static)
	 * 7 variables constantes (final)
	 * 7 variables del tipo int
	 */
	public static final int LUNES = 1;
	public static final int MARTES = 2;
	public static final int MIERCOLES = 3;
	public static final int JUEVES = 4;
	public static final int VIERNES = 5;
	public static final int SABADO = 6;
	public static final int DOMINGO = 7;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un dia de la semana: ");
		int diaSemanaNumero = scanner.nextInt();
		String dia;
		
		switch(diaSemanaNumero) {
		case LUNES:
			dia = "Lunes";
			break;
		case 2:
			//NOTA: Podemos usar ya sea el valor (2) o
			//directamente el nombre de la constante
			dia = "Martes numero";
			break;
//		case MARTES:
//			dia = "Martes LETRAS";
//			break;
		case MIERCOLES:
			dia = "Miercoles";
			break;
		case JUEVES:
			dia = "Jueves";
			break;
		case VIERNES:
			dia = "Viernes";
			break;
		case SABADO:
			dia = "Sabado";
			break;
		case DOMINGO:
			dia = "Domingo";
			break;
		default:
			dia = "Not Value";
		}
		System.out.println(dia);
	}	
}
