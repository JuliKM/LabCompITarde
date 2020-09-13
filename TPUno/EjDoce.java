package tpuno;

import java.util.Scanner;

public class EjDoce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        do {
            System.out.println("Ingrese un numero de dia de la semana");
            dia = sc.nextInt();
            if (dia < 1 || dia > 7) {
                System.out.println("Dia no valido");
            }
        } while (dia < 1 || dia > 7);
        switch (dia) {
            case 1:
                System.out.println("Lunes. Dia laboral");
                break;
            case 2:
                System.out.println("Martes. Dia laboral");
                break;
            case 3:
                System.out.println("Miercoles. Dia laboral");
                break;
            case 4:
                System.out.println("Jueves. Dia laboral");
                break;
            case 5:
                System.out.println("Viernes. Dia laboral");
                break;
            case 6:
                System.out.println("Sabado. Dia no laboral");
                break;
            case 7:
                System.out.println("Domingo. Dia no laboral");
                break;
        }

    }
}
