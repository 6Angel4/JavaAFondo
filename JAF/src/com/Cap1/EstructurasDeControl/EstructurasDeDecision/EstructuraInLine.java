package com.Cap1.EstructurasDeControl.EstructurasDeDecision;

import java.util.Scanner;

public class EstructuraInLine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input Num: ");
		int number = scanner.nextInt();

		System.out.println(number > 18 ? true : false);
	}
}
