package arreglosUnidimensionales;

import java.util.Scanner;

/*
 *Dado 2 array de enteros, el primero de tamaño 5 y el segundo de tamaño 10, 
 *pedir los valores numéricos enteros para cargar cada uno de los arreglos, 
 *cree un tercer arreglo de tamaño 5 que contenga en cada posición la suma de la multiplicación 
 *de cada elemento del array uno, por cada elemento del array 2
 *
ARRAY3= (posición 0 del arreglo 1 * posición 0 del arreglo 2) + (posición 0 del arreglo 1 * posición 1 del arreglo 2) + (posición 0 del arreglo 1 * posición 2 del arreglo 2) + .............+ (posición 4 del arreglo 1 * posición 9 del arreglo 2)
Use 2 estructuras iterativas anidadas para realizar el cálculo y asignación de los valores en el 3 array.
 */
public class Ej_10 {

	public static void main(String[] args) {
		int arrayChico[] = new int[5];
		int arrayGrande[] = new int[10];
		int arrayMulti[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Llenar el primer array");
		entrada(arrayChico);
		System.out.println("Llenar el segundo array");
		entrada(arrayGrande);
		arrayMulti = multiplicar(arrayChico, arrayGrande);
		mostrarArray(arrayMulti);
	}

	public static void entrada(int array[]) {
		Scanner sc = new Scanner(System.in);
	//System.out.println("Ingrese los valores para llenar el array");
	for (int i = 0; i < array.length; i++) {
		if(i==0) System.out.println("Ingrese "+ array.length + " valores" );
		array[i]= sc.nextInt();
	}
	}

	public static int [] multiplicar(int array1[], int array2[]) {
		int arrayMulti[] = new int[5];
		int suma=0;
		for (int i = 0; i < arrayMulti.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				suma += array1[i]*array2[j];
			}
			arrayMulti[i]= suma;
			suma=0;
		}
		
		return arrayMulti;
		
	}
	
	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			if(i==0) System.out.println("Array Resultante" );
			System.out.print(array[i]+" - ");
		}
	}

	
	
}
