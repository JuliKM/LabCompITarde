package arreglosMultidimensionales;

import java.util.Scanner;

public class Ej_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero de filas y columnas deseado: ");
		int x = (sc.nextInt());
		int y = (sc.nextInt());
		int primero[][] = new int[x][y];
		int segundo[][] = new int[y][x];
		int tercero[][] = new int[x][y];
		llenarArreglo(primero);
		System.out.println("Ahora a llenar el segundo");
		llenarArreglo(segundo);
		multiplicar2Arreglos(primero, segundo, tercero);
		System.out.println("Primer arreglo");
		mostrarArreglo(primero);
		System.out.println("Segundo arreglo");
		mostrarArreglo(segundo);
		System.out.println("Tercer arreglo");
		mostrarArreglo(tercero);
		sc.close();

	}

	public static void llenarArreglo(int arreglo[][]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese los valores para rellenar el arreglo");
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[0].length; j++) {
				arreglo[i][j] = sc.nextInt();
			}
			System.out.println("Siguiente fila");
		}

	}

	public static void multiplicar2Arreglos(int arreglo[][], int arreglo2[][], int multi[][]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < multi.length; i++) {
			for (int j = 0; j < multi[0].length; j++) {
				multi[i][j] = arreglo[i][j] * arreglo2[j][i];
			}
		}
	
	}

	public static void mostrarArreglo(int arreglo[][]) {
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[0].length; j++) {
				System.out.print(arreglo[i][j] + " |  ");
			}
			System.out.println(" ");
		}
	}
}
