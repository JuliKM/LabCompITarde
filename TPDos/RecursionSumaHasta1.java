
package TPDos;

import java.util.Scanner;

/**
 * Codifique un programa que solicite un númeroentero mayor a cero y que
 * mediante recursiónsume todos los números números naturalesdesde el
 * númeroingresado hasta 1. Ejemplo: Ingreso 10El programa debe sumar 10 + 9 + 8
 * +7 +6 + 5 + 4 +3+ 2 +1
 */
public class Ej_21 {

    public static void main(String[] args) {

       System.out.println("Ingrese un numero entero mayor a cero");
      Scanner sc = new Scanner(System.in);
      int nro = sc.nextInt();
      int suma = recursiva(nro);
        System.out.println("La suma recursiva de todos los numeros anteriores es: "+suma);
    }

    public static int recursiva(int nro) {
        int resultado;
        if (nro == 1) {
            return 1;

        } else {
            resultado = recursiva(nro - 1) + nro;
        }

        return resultado;
    }

}
