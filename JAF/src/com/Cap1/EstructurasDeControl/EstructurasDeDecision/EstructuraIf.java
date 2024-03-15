package com.Cap1.EstructurasDeControl.EstructurasDeDecision;
/*
 * 1.3.4 Estructuras de decision
 * if - Decision Simple
 * switch - Decision Multiple
 * ? : - Decision Ternario
 */
import java.util.Scanner;
public class EstructuraIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese numero: ");
		int numero = scanner.nextInt();
		
		//if(condicion){accion1}esle{accion2}
		if(numero>18) {
			System.out.print("Mayor a 18");
		}else {
			System.out.print("Menor a 18");
		}
		
	}
}
