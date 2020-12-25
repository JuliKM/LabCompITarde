package tpuno;

import java.util.Scanner;

public class EjSeis {

    public static void main(String[] args) {
        System.out.println("Ingresa el precio del producto");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = a * 1.21;
        System.out.println("El precio con IVA es de $" + b);
    }
}
