/*
 Escriba una aplicación que: 
 a)lea  20  números decimalesingresados  por  teclado  por  el  usuarioy  los  coloque  en  unarreglo unidimensional.
 b)determine y muestre el mayor de los números en el arreglo
 c)determiney  muestre  el  menor  de  los  números  del  arreglocalcule  y  muestre  el  rango (diferencia entre el mayor y el menor) de loselementos en el arreglo 
 */
package TpTres;

import java.util.Scanner;

public class Ej_4 {

    public static void main(String[] args) {
        System.out.println("Ingrese 20 numero enteros");
        Scanner sc = new Scanner(System.in);
        int matriz[] = new int[20];
        for (int i = 0; i < 20; i++) {
            matriz[i] = sc.nextInt();
        }

        int mayor = matriz[0];
        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i] > mayor) {
                mayor = matriz[i];

            }
        }
          int menor = matriz[0];
        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i]<menor){
                menor = matriz[i];
            }
        }
        int rango = mayor-menor;
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
        System.out.println("El rango es: "+rango);
    }
}
            
            
