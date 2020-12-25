/*
 Pedir el ingreso de dos cadenas por por teclado, indicar si la segunda cadena 
 se encuentra dentro de la primera (usar indexOf o contains).
 */
package TPDos;

import java.util.Scanner;

public class Ej_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primer cadena");
        String primer = sc.nextLine();
        System.out.println("Ingrese la segunda cadena");
        String segunda = sc.nextLine();
        int indice = primer.indexOf(segunda);
        if (indice > 1) {
            System.out.println("La posicion de la segunda respecto a la primera es: " + indice);

        } else {
            System.out.println("La segunda cadena no se encuentra dentro de la primera");
        }

    }
}
//