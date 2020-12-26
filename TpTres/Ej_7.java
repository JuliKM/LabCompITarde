package arreglosUnidimensionales;

import java.util.Scanner;

/*
 * Escriba una aplicación que solicite  y cargue en un arreglo10  dígitos enteros, luego cree
 * dos nuevos arreglos y asigne al primerolosnúmeros ingresados por el usuariode formaascendente 
 * y en el segundo de forma descendente.Muestre los 2 arreglos por pantalla.
 */
public class Ej_7 {
	public static void main(String[] args) {

		int arreglo[] = new int[10];

		int arregloDesc[] = new int[10];
		int aux = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese 10 valores numericos para el arreglo");
		for (int i = 0; i < arreglo.length; i++) {

			arreglo[i] = sc.nextInt();
		
		}
		sc.close();

		// Escribiendo en sentido ascendente (Bubble)
		for (int j = 0; j < arregloDesc.length; j++) {

			for (int i = 0; i < (arreglo.length - 1); i++) {
				if (arreglo[i] > arreglo[(i + 1)]) {
					aux = arreglo[i];
					arreglo[i] = arreglo[i + 1];
					arreglo[i + 1] = aux;
				}

			}
		}

		// Escribiendo en sentido descendente
		int j = 9;
		for (int i = 0; i < arreglo.length; i++) {
			arregloDesc[j] = arreglo[i];
			j--;
		}

		// Muestro por pantalla los dos arreglos
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print("Ascendente " + arreglo[i]);
			System.out.println("  ---  Descendente " + arregloDesc[i]);
		}

	}
}
