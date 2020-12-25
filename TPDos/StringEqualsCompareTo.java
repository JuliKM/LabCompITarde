/*
 Pedir  dos  palabras  por  teclado,  indicar  si  son  iguales.(equals,  compareTo, compareToIgnoreCase */
package TPDos;

import java.util.Scanner;

public class Ej_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primera cadena a comparar");
        String primera = sc.nextLine();
        System.out.println("Ingrese la segunda cadena a comparar");
        String segunda = sc.nextLine();
        int igual = primera.compareToIgnoreCase(segunda);
        System.out.println("df" + igual);
        if (igual > 0) {
            System.out.println("La primer cadena es mayor que la segunda");
        }
        if (igual == 0) {
            System.out.println("Las cadenas son iguales");
        }
        if (igual < 0) {
            System.out.println("La segunda cadena es mayor que la primera");
        }
    }
}
