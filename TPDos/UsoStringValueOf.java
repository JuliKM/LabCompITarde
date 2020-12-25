/*
Solicite   el   ingreso   de   un   número   y   conviértalo   a   un   String   mediante String.valueOf
 */
package TPDos;

import java.util.Scanner;

public class Ej_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nro = sc.nextInt();
        String cadena = String.valueOf(nro);
        System.out.println("El numero en string es "+cadena);
    }
    
 
}
