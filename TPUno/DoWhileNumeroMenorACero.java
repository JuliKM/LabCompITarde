package tpuno;

import java.util.Scanner;

public class EjDiez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.println("Ingrese un numero");
            a = sc.nextInt();
        } while (a < 0);
        System.out.println("El numero ingresado, "+a+", es mayor a cero");
    }
}
