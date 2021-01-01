package arreglosMultidimensionales;

import java.util.Scanner;

/*
 * Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o igual  a 10.  
 * Cree  un  arreglo  de  tamaño[X,X]de  tipo int,  nos  piden  hacer  un  menú con estas opciones:
 * a)Rellenar TODA la matriz de números, debes pedírselo al usuario.--
 * b)Suma de una fila que se pedirá al usuario (validarque elija una correcta)
 * c)Suma  de  una  columna  que  se  pedirá  al  usuario  (controlar  que  elija  una correcta)
 * d)Sumar la diagonal principal
 * e)Sumar la diagonal inversa 
 * f)La media de todoslos valores de la matriz
 * */
public class Ej_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MetodosUtiles me = new MetodosUtiles();
		boolean matrizLlena = false;
		System.out.println("Bienvenido! Ingrese la dimension de la matriz con la que desea trabajar");
		int dimMatriz = me.validarRango(4, 10);
		int miArreglo[][] = new int[dimMatriz][dimMatriz];
		System.out.println("Menu de opciones:" + "\n0)Rellenar TODA la matriz de números" + "\n1)Suma de una fila "
				+ "\n2)Suma  de  una  columna  " + "\n3)Sumar la diagonal principal" + "\n4)Sumar la diagonal inversa "
				+ "\n5)Calcular La media de todos los valores de la matriz\n -1 para terminar");
		System.out.println("Ingrese el numero correspondiente a la accion que desea realizar");
		int opcion;
		opcion = sc.nextInt();
		while (opcion != 0) {
			System.out.println("Primero debe llenar la matriz");
			opcion = sc.nextInt();
		}
		do {
			if (matrizLlena == true) {
				System.out.println("Ingrese el numero correspondiente a la accion que desea realizar");
				opcion = sc.nextInt();
			}
			switch (opcion) {
			case 0:
				me.llenarArreglo(miArreglo);
				matrizLlena = true;
			
				break;
			case 1:
				System.out.println("Elija una fila de la que desee ver la suma");
				int fila = me.validarRango(0, dimMatriz);
				int[] filas = me.sumarFilas(miArreglo);
				System.out.println("La suma para la fila deseada es: " + filas[fila]);
				break;
			case 2:
				int[] columnas = me.sumarColumnas(miArreglo);
				System.out.println("Elija una columna de la que desee ver la suma");
				int columna = me.validarRango(0, dimMatriz);
				System.out.println("La suma para la columna deseada es: " + columnas[columna]);
				break;
			case 3:
				int diagonal = me.sumarDiagonal(miArreglo);
				System.out.println("La suma de la diagonal es: " + diagonal);
				break;
			case 4:
				int diagonalInversa = me.sumarDiagonalInversa(miArreglo);
				System.out.println("La suma de la diagonal inversa es: " + diagonalInversa);
				break;
			case 5:
				double promedio = me.promedioMatriz(miArreglo);
				System.out.println("El promedio de los valores de la matriz es : " + promedio);
				break;
			case -1:
				continue;
			default:
				System.out.println("Opcion no valida. Ingrese '-1' para salir");
				break;
			}
		} while (opcion != -1);
		System.out.println("-----PROGRAMA FINALIZADO----");
	}
	
	
	// Validaciones
	/*
	 * System.out.println("\nVer arreglo"); me.mostrarArreglo(miArreglo);
	 * System.out.println("\nVer suma fila"); me.mostrarVector(filas);
	 * System.out.println("\nVer suma columna"); me.mostrarVector(columnas);
	 */
}
