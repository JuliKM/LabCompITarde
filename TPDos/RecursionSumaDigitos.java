package TPDos;

import java.util.Scanner;

/**
 * Suma los dígitosde un númeroingresado por el usuario de forma recursiva.
 * Ejemplo:elusuario ingresa 1596El programa debe sumar 1 + 5 + 9 + 6
 */
public class Ej_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de varios digitos");
        int nro = sc.nextInt();
        int suma = sumaDigitos(nro);
        System.out.println("La suma recursiva de sus numeros es: "+suma);
    }

    public static int sumaDigitos(int nro) {
        int res;
        if (nro < 1) {
            return 0;
        } else {

            res = sumaDigitos(nro/10) + nro%10;
        }
        return res;
    }
}
