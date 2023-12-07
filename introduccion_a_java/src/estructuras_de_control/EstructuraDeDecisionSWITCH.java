package estructuras_de_control;
/*
 * switch (valorEntrada){
 * 	case valor1:
 * 		ACCION1
 * 		ACCION2
 * 		break;
 * 	default:
 * 		masAcciones;
 * }
 * 
 * Dependiendo del valor de entrada, el programa ingresara por el case cuyo valor
 * coincide con el de la variable.
 * Se ejecutaran las ACCIONES hasta que encuentre la sentencia break;
 * 
 */
import java.util.Scanner;
public class EstructuraDeDecisionSWITCH {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un dia de la semana (numero): ");
		int valor = scanner.nextInt();
		
		String dia;
		
		switch(valor) {
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
			dia = "Dia incorrecto... El valor debe ser entre 1 y 7";
		}
		System.out.println(dia);
		
	}

}
