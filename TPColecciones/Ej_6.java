package colecciones1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* Codifique una aplicación que solicite y cargue en una ArrayList<Integer> 10 dígitos  enteros,  luego  cree  dos  nuevas 
 * ArrayList<Integer> y  asigne  a la primera los números ingresados por el usuario de forma ascendente y en la segunda
 * de   forma   descendente.   Muestre   las   2 listas por   pantalla. 
 * Investigue como ordenar una Lista(List<>)
 * */
public class Ej_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arry = new ArrayList<>();
		ArrayList<Integer> arryAsc = new ArrayList<>();
		ArrayList<Integer> arryDesc = new ArrayList<>();
		System.out.println("Ingrese 10 nros");
		for (int i = 0; i < 10; i++) {
			arry.add(sc.nextInt());
		}
		arryAsc = arry;
		arryDesc = arry;
		System.out.println("Ascendente: ");
	    Collections.sort(arryAsc);
	    for (Integer integer : arryAsc) {
			System.out.print(integer+"\t");
		}
		System.out.println("\nDescendente: ");
	    Collections.sort(arryDesc, Collections.reverseOrder());
	    for (Integer integer : arryDesc) {
				System.out.print(integer+"\t");
			}    
		
		
	}
}
