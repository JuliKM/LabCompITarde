package colecciones1;

import java.util.ArrayList;
import java.util.Scanner;

/* Ejercicio  7
 * Crea   una   clase   Matriz   que   contenga   una   variable   global ArrayList<Celda> 
 * ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
 * Codifique un programa que solicite al  usuario un valor para la celda y que solicite la posición donde se desea 
 * almacenar el valor, cree  una  instancia  de  la  clase  Celda,  asigne  los  valores  cargados por  el  usuario  y  
 * agregue  la  instancia  a  la  lista matrizCuadrada; 
 * repita  este  proceso  hasta  que  el  usuario  ingrese  como  valor  la cadena “FIN”.
 * Muestre por pantalla los valores cargados en matrizCuadrada. 
 * Codifique un método que reciba como parámetro los valores fila y columna y retorne el valor almacenado, 
 * en caso de que la fila y la columna no exista retorne el mensaje “La fila y columna indicada no ha sido asignada”
 * */
public class Matriz {

	public static void main(String[] args) {
		ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
		// Celda cel = new Celda();
		// int cel ;
		String palabra;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Ingrese una palabra. FIN para finalizar");
			Celda cel = new Celda();
			palabra = sc.next();
			if (palabra.equals("FIN"))
				break;
			cel.setValor(palabra);
			System.out.println("Ingrese nro de fila");
			cel.setFila((sc.nextInt()-1));
			System.out.println("Ingrese nro de columna");
			cel.setColumna((sc.nextInt()-1));
			matrizCuadrada.add(cel);

		} while (!palabra.equals("FIN"));

		for (Celda celda : matrizCuadrada) {
			// Muestre por pantalla los valores cargados en matrizCuadrada. En Forma de
			// ArrayList
			System.out.println(
					"Fila " + celda.getFila() + ". Columna " + celda.getColumna() + ". Valor " + celda.getValor());
		}
//		Muestre por pantalla los valores cargados en matrizCuadrada. En forma de Matriz
		// Armo la matrix
		int maxFila = 0;
		int maxCol = 0;
		for (Celda celda : matrizCuadrada) {
			if (celda.getFila() > maxFila)
				maxFila = (celda.getFila());
			if (celda.getColumna() > maxCol)
				maxCol = (celda.getColumna());
		}
		maxFila++;
		maxCol++;
		
		String matrix[][] = new String[(maxFila)][(maxCol)];
		// Lleno la matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j]= "vacio";
			}
		}
		System.out.println("maxfila "+maxFila+" maxCol "+maxCol);
		for (Celda celda : matrizCuadrada) {
			matrix[(celda.getFila())][(celda.getColumna())] = celda.getValor();
		}
		
		//Muestro el array
		mostrarArreglo(matrix);
		
		System.out.println("Ingrese el valor de fila y columna que desea buscar");
		int filaBuscar = (sc.nextInt()-1);
		int colBuscar = (sc.nextInt()-1);
		buscarValorEnMatriz(filaBuscar, colBuscar, matrix);
	}
 
	public static void mostrarArreglo(String arreglo[][]) {
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[0].length; j++) {
				System.out.print(completarConEspacios(arreglo[i][j]) + " |  ");
			}
			System.out.println(" ");
		}
	}
	
	public static String completarConEspacios(String cadena) {
		int cantidadEspacios = 15 - cadena.length();
		for (int i = 0; i < cantidadEspacios; i++) {
			cadena += " ";
		}
		return cadena;
	}
	
	public static void buscarValorEnMatriz(int fila, int col, String matrix[][]) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[fila][col].equals("vacio")) {
					System.out.println("\nLa fila y columna indicada no ha sido asignada");
					i= matrix.length;
					j =  matrix[0].length;
				}else {			
				System.out.println("\nEl valor es: " + matrix[fila][col]);
				i= matrix.length;
				j =  matrix[0].length;
				}
			}
		}	
	}
}
