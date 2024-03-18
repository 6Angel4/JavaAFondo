package com.Cap1.EstructurasDeControl.EstructurasIterativas;

public class EstructuraFor {
	public static void main(String[] args) {
		/*
		 * El Scope de la variable local i
		 * es solo dentro del ciclo for,
		 * luego de que este termine 
		 */
		for (int i = 20; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
