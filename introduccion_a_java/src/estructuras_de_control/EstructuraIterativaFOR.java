package estructuras_de_control;
import java.util.Iterator;
/*
 * 	for(inicializacion;condicion;incremento){
 * 		accion1;
 * 		accion2;
 * 	}
 * 
 * Primero se define e inicializa una variable
 * Despues se especifica una condicion
 * Por ultimo se define un incremento (o decremento, segun se requiera)
 */
import java.util.Scanner;
public class EstructuraIterativaFOR {

	public static void main(String[] args) {
		// Ejemplo: Muestra numeros naturales
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa un valor: ");
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}

	}

}
