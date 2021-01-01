package arreglosMultidimensionales;

import java.util.Scanner;

public class Ej_1 {
	public static void main(String[] args) {
		String paises[][] = new String[4][4];
		llenarArreglo(paises);
		mostrarArreglo(paises);

	}

	public static void llenarArreglo(String array[][]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println(" Ingrese un pais y 3 ciudades correspondientes al mismo");
			for (int j = 0; j < array.length; j++) {
				array[i][j] = sc.nextLine();
			}
		}
		sc.close();
	}

	public static void mostrarArreglo(String array[][]) {
		Scanner sc = new Scanner(System.in);
//	
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j == 0)
					System.out.print("Pais: " + completarConEspacios(array[i][j]) + " ");
				if (j == 1)
					System.out.print("Ciudades: " + completarConEspacios(array[i][j]) + " ");
				if (j > 1)
					System.out.print(completarConEspacios(array[i][j]) + " ");

			}
			System.out.println(" ");
		}
		sc.close();
	}

	public static String completarConEspacios(String cadena) {
		int cantidadEspacios = 12 - cadena.length();
		for (int i = 0; i < cantidadEspacios; i++) {
			cadena += " ";
		}
		return cadena;
	}
}
