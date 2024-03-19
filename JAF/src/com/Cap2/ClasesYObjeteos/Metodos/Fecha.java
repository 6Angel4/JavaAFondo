package com.Cap2.ClasesYObjeteos.Metodos;

/**
 *  public = se puede acceder a ella.
 *  class = establecemos que es una clase
 *  Fecha = firma de la clase
 */
public class Fecha {
	/*
	 * variables de instancia
	 * private = solo se pueden acceder dentro de la clase
	 * int = tipo de variable
	 * dia, mes, anio = firma
	 */
	private int dia;
	private int mes;
	private int anio;
	
	
	/**
	 * Metodo get 
	 * retorna el valor de la variable de instancia dia
	 * @return dia
	 */
	public int getDia() {
		return dia;
	}
	
	
	/**
	 * Metodo set
	 * asigna el valor del parametro a la variable de instancia dia
	 * @param dia
	 */
	public void setDia(int dia) {
		//this.dia = valor(dia)
		this.dia = dia;
	}


	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}


	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}


	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}


	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
}
