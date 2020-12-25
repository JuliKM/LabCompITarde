package tpuno;

import java.util.Scanner;

public class EjOnce {

    public static void main(String[] args) {
        String pass = "Mipass";
        Scanner sc = new Scanner(System.in);
        int intento = 2;
        while (intento >= 0) {
            System.out.println("Ingrese la contraseña:");
            String ingreso = sc.nextLine();
            if (ingreso.equals(pass)) {
                System.out.println("Acceso correcto");
                intento=-1;
            } else {
                System.out.println("Contraseña incorrecta. Quedan " + intento + " intentos");
                intento--;
            }
        }
    }
}
