package arreglosUnidimensionales;

import java.util.Scanner;

/*
 * Solicite al usuario el ingreso de una cadena de números separadas por guiones medio,
 *  por ejemplo:45-9-8-6-45-23-21-74-96-32-45-25
 * Posteriormente aplique el método SPLITde los String de Java paraconvertir la cadena
 *  en un arreglo, y calcular la suma total de los elementos y el valor promedio calculado. 
 * */

public class Ej_8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input;
		double suma=0;
		System.out.println("Ingrese una cadena de números separadas por guiones medios");
		input = sc.next();
		sc.close();
		String []partes =  input.split("-");
		for (String string : partes) {
		suma += Integer.parseInt(string) ;
		}
		double promedio = suma/partes.length;
		
		System.out.println("La suma de los numeros es: "+suma+" y su promedio es: "+promedio);
		
	}
}
