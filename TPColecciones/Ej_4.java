package colecciones1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 Codifique una aplicaciónque permita almacenar palabras en un ArrayList<String>hasta que se ingrese la 
 palabra “salir”, al finalizar muestre por pantalla:
 * a)Las palabras ingresadas
 * b)Indicar cuál de las palabras ingresadas posee más caracteres
 * c)Indicar si se ingresaron o no palabras iguales o repetidas
 * d)Mostrar las palabras repetidas ingresadas y cuantas veces se repitió esa palabra
 */
public class Ej_4 {

	public static void main(String[] args) {
		ArrayList<String> palabras = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String palabra;
		do {
			System.out.println("Ingrese palabras. \"salir\" para finalizar");
			palabra = sc.next();
			if (!palabra.equals("salir"))
				palabras.add(palabra);
		} while (!palabra.equals("salir"));

		String masCaracteres = "";
		for (String palabr : palabras) {

			if (palabr.length() > masCaracteres.length()) {
				masCaracteres = palabr;
			}
		}
		System.out.println("Palabras ingresadas: ");
		for (String palab : palabras) {
			System.out.print(palab + "\t");
		}
		System.out.println("\nPalabra con mas caracteres: " + masCaracteres);
		List<String> list = new ArrayList<String>();
		for (String pa : palabras) {
			list.add(pa);
		}
		boolean repetidos = false;
		Set<String> unique = new HashSet<String>(list);
		boolean titulo = false;
		for (String key : unique) {

			if (Collections.frequency(list, key) > 1) {
				if (titulo == false)
					System.out.println("Palabras repetidas: ");
				titulo = true;
				System.out.println(key + ": " + Collections.frequency(list, key));
				repetidos = true;
			}
		}
		if (repetidos == false)
			System.out.println("No hay palabras repetidas");
	}
}
