/*
Crea  un  array  o  arreglo  unidimensional  con  un  tamaño  de  5,  asignale  los  valores numéricos  manualmente  (los  que túquieras)  y  muestralos  por  pantalla.  
Solicite  los números mediante un bucle
 */
/*Ej 1 ¿Qué sucede si tratamos de acceder un elemento fuera del tamaño del array?
Nos indica un error: ArrayIndexOutOfBoundsException: 
*/
package TpTres;

import java.util.Scanner;

public class Ej_2 {
    
    public static void main(String[] args) {
        int arreglo [] = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los numeros para el arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = sc.nextInt();
        }
        System.out.println("Los numeros del arreglo son: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+", ");
        }
        ;
    }
    
    
}
