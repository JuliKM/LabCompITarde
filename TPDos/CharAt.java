/*
 Solicite el ingreso de una cadena y determine el tamaño de la misma y cuantas vocales tiene en total (recorre el String con charAt)
 */
package TPDos;

import java.util.Scanner;

public class Ej_7 {

    public static void main(String[] args) {
        System.out.println("Ingrese una cadena de caracteres");
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        int len = cadena.length();
        int cont = 0;
        String cadenaor = cadena;
        cadena = cadena.toLowerCase();
        for (int i = 0; i < len; i++) {
            if ((cadena.charAt(i)) == 'a' || (cadena.charAt(i)) == 'e' || (cadena.charAt(i)) == 'i' || (cadena.charAt(i)) == 'o' || (cadena.charAt(i)) == 'u') {
                cont++;
            }
        }
        System.out.println("La cadena tiene: " + len + " letras y " + cont + " vocales.");
        //Ejercicio 8
        System.out.println("Ejercicio 8 ");
        cadena = cadena.replace('a', 'e');
        System.out.println("Cadena reemplazada: " + cadena);
        //Ejercicio 9
        //Recorre  el  String  del ejercicio  6  y  transforma  cada  carácter  a  su  código  ASCII. Muéstralosen línearecta, separados por un espacio entre cada carácter
        System.out.println("Ejercicio 9, en caracteres ascii:");
        for (int i = 0; i <  len; i++) {
            int ascii = cadenaor.charAt(i);
            System.out.print(ascii + " ");
        }
    }
}
