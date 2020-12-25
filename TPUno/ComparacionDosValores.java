
package tpuno;

import java.util.Scanner;

public class EjCuatro {
    public static void main(String[] args) {
        System.out.println("Ingrese dos valores enteros a comparar");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("El primer valor es mayor al segundo");
    }else if(a<b){
            System.out.println("El segundo valor es mayor al primero");
            
    }else System.out.println("Ambos valores son iguales");
}
}
