package estructuras_de_control;
/*
 * 	1.3.4
 * 
 * 	condicion ? retornoPorTrue : retornoPorFalse
 * 
 * Se verifica la CONDICION entonces
 * RETORNA la expresion ubicada entre el ? (signo de interrogacion) y : (dos puntos)
 * Si la condicion es falsa RETORNA  la expresion ubicada despues de los : (dos puntos)
 * 
 */
import java.util.Scanner;
public class EstructuraDeDecisionTERNARIO {

	public static void main(String[] args) {
		//Ejemplo: ¿es par o impar? (con if-inline)
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un valor: ");
		int valor = scanner.nextInt();
		
		int resto = valor % 2;
		
		//Haciendo uso de if-inline
		String msg = (resto == 0) ? "Es PAR" : "Es IMPAR";
		
		//Mostrar el resultado
		System.out.println(valor+" "+msg);
	}

}
