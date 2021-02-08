package parcial1LZ;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MetodosUtiles {

	Date date = new Date();

	public MetodosUtiles() {
		// Constructor
	}

	// INT
	public int validarRango(int min, int max) {
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
	


	// LONG
	public long validarCantidadDigitos(int cantidadDeDigitos) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero de " + cantidadDeDigitos + " digitos:");
		long valorValidado = sc.nextLong();
		int length = String.valueOf(valorValidado).length();
		if (length != cantidadDeDigitos) {
			System.out.println("Cantidad de digitos incorrecta");
			validarCantidadDigitos(cantidadDeDigitos);
		}
		return valorValidado;
	}
	
	//DOUBLE
	public double calcularPrecioConPorcentajeGanancia(double precio, double margenGanancia){
		//El margen de ganancia debe venir en formato de porcentaje
		double precioVenta = 0;
			precioVenta = precio*(1+margenGanancia/100);

			return precioVenta ;
	}

	// STRING
	public String completarConEspacios(String cadena) {
		int cantidadEspacios = 20 - cadena.length();
		for (int i = 0; i < cantidadEspacios; i++) {
			cadena += " ";
		}
		return cadena;
	}

	public boolean validarPassword(String valorIngresado, String password) {
		Scanner sc = new Scanner(System.in);
		boolean accesoCorrecto = false;
		int intentosRestantes = 3;
		while (intentosRestantes > 0) {
			if (valorIngresado.equals(password)) {
				System.out.println("Acceso Correcto");
				accesoCorrecto = true;
				intentosRestantes = 0;
			} else {
				System.out.println("Contrasena incorrecta. Por favor intente nuevamente");
				accesoCorrecto = false;
				System.out.println("Quedan " + intentosRestantes + " intentos.");
				intentosRestantes--;
				valorIngresado = sc.next();
			}
		}

		return accesoCorrecto;
	}

	public String validarNoVacio() {
		Scanner sc = new Scanner(System.in);
		String valorParaValidar = sc.next();
		if (valorParaValidar.equals("")) {
			System.out.println("El valor a ingresar no puede ser vacio;");
			validarNoVacio();
		}

		return valorParaValidar;
	}

	// DATE

	public void fechaMenorAHoy(int mes, int anio) {

		LocalDate today = LocalDate.now();
		LocalDate anotherDay = LocalDate.of(anio, mes, 1);

		int diferencia = today.compareTo(anotherDay);
		if (diferencia < 0) {
			System.out.println("Debe ingresar una fecha menor a la actual(Ingrese mes , anio)");
			Scanner sc = new Scanner(System.in);
			mes = sc.nextInt();
			anio = sc.nextInt();
			fechaMenorAHoy(mes, anio);

		}

	}

	// VECTORES

	public void mostrarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " |  ");
		}
	}

	// ARREGLOS

	public void llenarArreglo(int arreglo[][]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese los valores para rellenar el arreglo");
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[0].length; j++) {
				arreglo[i][j] = sc.nextInt();
			}
			System.out.println("Siguiente fila");
		}
	}

	public void mostrarArreglo(int arreglo[][]) {
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[0].length; j++) {
				System.out.print(arreglo[i][j] + " |  ");
			}
			System.out.println(" ");
		}
	}

	public void mostrarArregloString(String arreglo[][]) {
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[0].length; j++) {
				System.out.print(completarConEspacios(arreglo[i][j]) + " |  ");
			}
			System.out.println(" ");
		}
	}

	public int[] sumarColumnas(int arreglo[][]) {
		int vectorRespuesta[] = new int[arreglo.length];
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[0].length; j++) {
				vectorRespuesta[j] += arreglo[i][j];
			}
		}
		return vectorRespuesta;
	}

	public int[] sumarFilas(int arreglo[][]) {
		int vectorRespuesta[] = new int[arreglo.length];
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[0].length; j++) {
				vectorRespuesta[i] += arreglo[i][j];
			}
		}
		return vectorRespuesta;
	}

	public int sumarDiagonal(int arreglo[][]) {
		int diagonal = 0;
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				if (i == j)
					diagonal += arreglo[i][j];
			}
		}
		return diagonal;
	}

	public int sumarDiagonalInversa(int arreglo[][]) {
		int diagonalInversa = 0;
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				if ((i + j) + 1 == arreglo.length)
					diagonalInversa += arreglo[i][j];
			}
		}
		return diagonalInversa;
	}

	public double promedioMatriz(int arreglo[][]) {
		double suma = 0;
		int cont = 0;
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				suma += arreglo[i][j];
				cont++;
			}
		}
		double promedio = suma / cont;
		return promedio;
	}

	public static void buscarPromEnMatrizoriginal(int promedio, int matrix[][]) {
		boolean found = false;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (promedio == matrix[i][j]) {
					System.out.println("\nEl valor " + promedio + " se encuentra en la celda: fila " + (i + 1)
							+ " columna " + (j + 1));
					found = true;
				}
			}
		}
		if (found == false)
			System.out.println("\nEl valor del promedio (" + promedio + "), no se encuentra en ninguna celda");
	}

	public static void buscarValorEnMatriz(int valor, int matrix[][]) {
		boolean found = false;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (valor == matrix[i][j]) {
					System.out.println("\nEl valor " + valor + " se encuentra en la celda: fila " + (i + 1) + " columna "
							+ (j + 1));
					found = true;
				}
			}
		}
		if (found == false)
			System.out.println("\nEl valor  (" + valor + "), no se encuentra en ninguna celda");
	}

	public void buscarValorEnVector(int valor, String matrix[][], int columna) {
		Scanner sc = new Scanner(System.in);
		boolean found = false;
		String valorString = String.valueOf(valor);
		for (int i = 0; i < matrix.length; i++) {
			if ((matrix[i][columna]).equals(valorString)) {
				System.out.println("\nValor correcto");
				found = true;
				break;
			}
		}
		if (found == false) {
			System.out.println("El códigodel agroquímico ingresado  no  existe,  intente nuevamente");
			// System.out.println("\nEl codigo ("+valor+"), no se encuentra en ninguna
			// celda, ingrese otro codigo");
			valor = sc.nextInt();
			buscarValorEnVector(valor, matrix, columna);
		}
	}

	public  String devuelveValorRespectoAOtroMatriz(String valor, String matrix[][], int columnaOrigen, int columnaDestino) {
		boolean found = false;
		String devolverValor = " ";
		for (int i = 0; i < matrix.length; i++) {
			if ((matrix[i][columnaOrigen]).equals(valor)) {
				devolverValor = matrix[i][columnaDestino];
			}

		}
		return devolverValor;

	}
	
	public String sumarUnaColumna(String matrix[][], int columnaASumar) {
		double sumatoriaDouble=0;
		
		for (int i = 0; i < matrix[0].length; i++) {
			sumatoriaDouble +=  Integer.parseInt(matrix[0][i]);
		}
		String sumatoria = String.valueOf(sumatoriaDouble);
		return sumatoria;
	}
}