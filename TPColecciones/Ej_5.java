package colecciones1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/* Realice  una  b�squeda  secuencialen  un ArrayList<Integer>que  contenga50 elementos generado saleatoriamente 
 * mediante la funci�n java random. 
 * Realice una b�squeda secuencial de la siguiente forma: 
 * -se lee el valor que se desea buscar, se compara la primera posici�n; 
 * -si son iguales, fin de la b�squeda. 
 * -De   lo   contrario,   compararlo   con   la   segunda   posici�n,   y   as� sucesivamente. 
 * -Si se llega al final del arreglo y no se encontr� el valor, debe indicarlo con un mensaje apropiado. 
 * -Si se encuentra, se debe especificar la posici�n que ese valor ocupa en la lista por primera vez 
 * */
public class Ej_5 {
	public static void main(String[] args) {
		ArrayList<Integer> arry = new ArrayList<>();
		Random random = new Random();
		boolean found = false;
		for (int i = 0; i < 50; i++) {
			int aux = random.nextInt(50);
			arry.add(aux);
			System.out.print(aux + "\t");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("\nIngrese el nro a buscar");
		int nro = sc.nextInt();
		for (Integer integer : arry) {

			if (integer == nro) {
				System.out.println("El numero buscado se encuentra en la posicion " + ((arry.indexOf(integer)) + 1));
				found = true;
				break;
			}
		}
		if (found == false)
			System.out.println("No se ha encontrado el numero ingresado");
	}
}