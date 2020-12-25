/*
 Crea un array o arreglo unidimensional donde túle indiques el tamaño por teclado y crear una  función  que  rellene  el  array  o  
 arreglo  con  los  múltiplos  de  un  numero  pedido  por teclado. 
 Por ejemplo, si defino un array de tamaño 5 y elijoun 3 en la función, el array contendrá 3, 6, 9, 12, 15. 
 Muéstralospor pantalla usando otra función distinta. */
package TpTres;

import java.util.Scanner;

public class Ej_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño deseado para el arreglo");
        int size = sc.nextInt();
        int[] arreglo = new int[size];
        System.out.println("Ingresa el numero que quieras ver multiplicado");
        int base = sc.nextInt();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = base*(i+1);
        }
        System.out.println("Los multiplos son: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+", ");
        }
    }
}
