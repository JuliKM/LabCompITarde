/**
 * Codifiqueuna aplicación para almacenar en un ArrayList<Integer>
 * aleatoriamente 20 números enteros positivos pares del 1 al 100, de los cuales
 * se desea saber: a) su promedio aritmético b) cuántos de los números son
 * iguales al promedio aritmético c) cuántos de los números son mayores que el
 * promedio aritmético d) cuántos de los números son menores que el promedio
 * aritmético
 */
package colecciones1;

import java.util.ArrayList;

public class Ej_3 {
	public static void main(String[] args) {
		// (int)(Math.random() * maximum);
		ArrayList<Integer> arr = new ArrayList();

		ArrayList<Integer> mayores = new ArrayList();
		ArrayList<Integer> menores = new ArrayList();
		ArrayList<Integer> iguales = new ArrayList();

		for (int i = 0; i < 20; i++) {
			arr.add((int) (Math.random() * 100));
		}
		Double suma = 0.0;
		int mayor = 0;
		int menor = 0;
		int igual = 0;

		for (Integer arr1 : arr) {
			System.out.print("Nro: " + arr1 + "\t ");
			suma += arr1;
		}
		Double promedio = suma / 20;
		for (Integer menore : arr) {
			if (menore < promedio) {
				menores.add(menore);
				mayor++;
			}
		}
		int promedioInt = (int) Math.round(promedio);
		for (Integer mayore : arr) {
			if (mayore > promedio) {
				mayores.add(mayore);
				menor++;
			}

		}
		for (Integer iguale : arr) {

			if (iguale == promedioInt) {
				iguales.add(iguale);
				igual++;
			}
		}
		System.out.println("\nPromedio redondeado: " + promedioInt + ". Hay " + igual + " numeros iguales al promedio");
		System.out.println("\nPromedio: " + promedio + "\nHay " + menor + " numeros menores al promedio y " + mayor
				+ " numeros mayores al promedio");

	}
}
