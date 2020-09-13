package tpuno;

import java.util.Scanner;

public class EjCinco {

    public static void main(String[] args) {
        System.out.println("Ingresa un numero para verificar si es par");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a%2;
        if(b==0){
            System.out.println("El numero es divisible por 2");
        } else {
            System.out.println("El numero no es divisible por 2");
        }
        
    }

}
