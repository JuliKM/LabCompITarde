package TPAlgoritmosEsenciales;

import java.util.Scanner;

/**
 * Codifique un algoritmo que solicite un 2 valores enteros mayoreso iguales a2,
 * que se corresponden a cantidad de fila sy columnas. Cree un arreglo de
 * tamaño[X,Y]de tipoentero,el tamaño se corresponde a los 2 valores enteros
 * ingresados inicialmente. Solicite al usuarioque ingrese números enteros para
 * cargar cada una de las celdas de la matriz. Finalizada la carga calcule el
 * promedi oentero de los elementos asignados y cargados en la matriz. Para
 * terminar determinesi el promedio calculado se encuentra asignado en alguna de
 * las celdas, si es así indique la posición o posiciones correspondientes, caso
 * contrario muestre el mensaje “No se encontró ninguna coincidencia”.
 */
public class Ej_5 {

    public static void main(String[] args) {
        System.out.println("Ingrese el numero de filas de la matriz que desea crear (numero mayor a 2)");
        Scanner sc = new Scanner(System.in);
        int fila =  validarMayorADos();
      
        System.out.println("Ingrese el numero de columnas de la matriz que desea crear (numero mayor a 2)");
        int col= validarMayorADos();

        int matrix[][] = new int[fila][col];
        llenarArreglo(matrix);
        mostrarValores(matrix, fila);
        // matrizDiagonal(matrix, fila);
        //int vector[] = new int[fila];
        //vector = matrizDiagonal(matrix, fila);
        //mostrarVector(vector, fila);
        int promedio = promedioMatriz(matrix);
      //  System.out.println("\nEl promedio de los valores de la matriz diagonal es " + promedio);
        buscarPromEnMatrizoriginal(promedio, matrix);
        System.out.println("Programa finalizado");
    }

    public static int validarMayorADos() {
        Scanner sc = new Scanner(System.in);
        int fila = sc.nextInt();
        if (fila <= 2) {
            System.out.println("Valor no valido... debe ingresar un numero mayor a dos");
            fila = validarMayorADos();
        }
        return fila;
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
    
    
    public static void mostrarValores(int matrix[][], int fila) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("  " + matrix[i][j]);
            }
        }
    }
	public static int promedioMatriz(int arreglo[][]) {
		int suma = 0;
		int cont = 0;
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[0].length; j++) {
				suma += arreglo[i][j];
				cont++;
			}
		}
		int promedio = suma / cont;
		return promedio;
	}
         public static void buscarPromEnMatrizoriginal(int promedio, int matrix[][]) {
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (promedio== matrix[i][j]){
                   System.out.println("\nEl valor "+promedio+" se encuentra en la celda fila "+(i+1)+" columna "+(j+1));
                   found = true;
                }
                

            }
        } if (found ==false) System.out.println("\nEl valor del promedio ("+promedio+"), no se encuentra en ninguna celda");
    }
}
