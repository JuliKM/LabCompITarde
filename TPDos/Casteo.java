/*
CASTEO: Codifique un programa que solicite el ingreso de un numero decimal y asigne  el  mismo  a  una  variable valorDecimalde  tipo  double.  
Aplique  las operaciones  de  CASTING  para  convertir  la  variable  a  los  siguientes  tipos  de datos, short, int, long, String, float. 
Investigue las diferentes formas de lograr la conversión.
Muestre por pantalla el resultado de las conversiones.
 */
package TPDos;

import java.util.Scanner;

public class Ej_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero decimal");
        double nro = sc.nextDouble();
        short corto = (short) nro;
        int entero =  (int) nro;
        long largo = (long) nro;
        String cadena = String.valueOf((int)nro);
        float flotante = (float) nro;
        System.out.println("Numero inicial: "+nro+"\nshort: "+corto+"\nint: "+entero+"\nlong: "+largo+"\nString: "+cadena+"\nfloat: +"+flotante);
    }
}
