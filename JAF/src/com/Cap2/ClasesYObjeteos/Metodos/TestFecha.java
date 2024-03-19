package com.Cap2.ClasesYObjeteos.Metodos;

public class TestFecha {
	public static void main(String[] args) {
		//Instacniar la clase Fecha, para acceder a sus atributos y metodos
		Fecha f = new Fecha();
		
		//Uso del metodo setXXX
		f.setDia(23);
		f.setMes(03);
		f.setAnio(1996);
		
		//Uso del metodo getXXX
		System.out.println(f.getDia());
		System.out.println(f.getMes());
		System.out.println(f.getAnio());
		
		/*
		 * Impresion de la fecha
		 */
		System.out.println(f);//Esto no funcionara (com.Cap2.ClasesYObjeteos.Metodos.Fecha@372f7a8d)
		
	}
}
