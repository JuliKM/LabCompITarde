/*
 Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos(100 -999) y 
 por medio del uso de las operaciones matemáticas módulo10 y división por 10 
 efectué la suma de los 3 dígitosdel número. 
 Ejemplo ingreso 563, salida del algoritmo 14
 */
package TPDos;

import java.util.Scanner;

public class Ej_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 3 digitos");
        int nro = sc.nextInt();
        if (nro > 99 && nro < 1000) {
            int unidad = nro % 10;
            int div = nro / 10;
            int decena = div % 10;
            int centena = div / 10;
            int suma = unidad + decena + centena;
            System.out.println("Suma de los 3 digitos: " + suma);
        } else {
            System.out.println("Numero fuera de rango");
        }
    }
}
