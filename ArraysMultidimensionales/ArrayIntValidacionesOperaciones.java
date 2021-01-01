package arreglosMultidimensionales;

import java.util.Scanner;

/* Codifique un programa que solicite un valor enteroXmayor o igual a 3 y 
 * menor o igual a 10. Cree un arreglo de tamaño[X,X]de tipo int. 
 * Posteriormente solicitelos valores  necesarios  para  cargar  cada  una  de  las  celdas  de  la  matriz. 
 * Muestre  por pantalla la matriz resultante. 
 * Al finalizar la carga sume cada una de las columnas del array y 
 * asigne los resultados en una nueva matriz de una dimensión,
 * finalmente sume los valores de esta última matriz y muestre el resultado por pantalla.
 */
public class Ej_3 {

	public static void main(String[] args) {
		int min = 3;
		int max = 10;
		int valorValidado = validarRango(min, max);

		int array[][] = new int[valorValidado][valorValidado];
		llenarArreglo(array);
		mostrarArreglo(array);
		int vecSuma[] = sumarColumnas(array);
		mostrarVector(vecSuma);
	}

	public static int validarRango(int min, int max) {
		Scanner sc = new Scanner(System.in);
		int valorValidado;
		int tamano;
		do {
			System.out.println("Ingrese un valor entero mayor o igual a " + min + " y menor o igual a " + max);
			tamano = sc.nextInt();
			if (tamano < min || tamano > max)
				System.out.println("Valor fuera de rango ");
		} while (tamano < min || tamano > max);
		valorValidado = tamano;
		return valorValidado;
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

	public static void mostrarArreglo(int arreglo[][]) {
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[0].length; j++) {
				System.out.print(arreglo[i][j] + " |  ");
			}
			System.out.println(" ");
		}
	}

	public static int[] sumarColumnas(int arreglo[][]) {
		int vectorRes[] = new int[arreglo.length];
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[0].length; j++) {
				vectorRes[i] += arreglo[j][i];
			}
		}
		return vectorRes;
	}

	public static void mostrarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " |  ");

		}

	}
}
