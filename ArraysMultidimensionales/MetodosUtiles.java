package arreglosMultidimensionales;

import java.util.Scanner;

public class MetodosUtiles {

	public MetodosUtiles() {
		//Constructor
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

	// STRING
	public String completarConEspacios(String cadena) {
		int cantidadEspacios = 20 - cadena.length();
		for (int i = 0; i < cantidadEspacios; i++) {
			cadena += " ";
		}
		return cadena;
	}

	public boolean validarPassword(String valorIngresado, String password) {
		Scanner sc  = new Scanner(System.in);
		boolean accesoCorrecto = false;
		int intentosRestantes = 3;
		while  (intentosRestantes>0){
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
		int vectorRes[] = new int[arreglo.length];
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[0].length; j++) {
				vectorRes[j] += arreglo[i][j];
			}
		}
		return vectorRes;
	}

	public int[] sumarFilas(int arreglo[][]) {
		int vectorRes[] = new int[arreglo.length];
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[0].length; j++) {
				vectorRes[i] += arreglo[i][j];
			}
		}
		return vectorRes;
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

}