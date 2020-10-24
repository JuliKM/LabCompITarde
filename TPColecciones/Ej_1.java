package TPCollecciones;

import java.util.ArrayList;
import java.util.Scanner;

/*
 Creeun ArrayList<Integer>, que  permita asignar  los valores  numéricos manualmente  (los  que  tú  quieras)  hasta  ingresar  un  valor  menor  a  0, mostrar los números por pantalla. 
 Solicite los números mediante un bucle
 */
public class Ej_1 {

    public static void main(String[] args) {
        ArrayList<Integer> myAL = new ArrayList();
        System.out.println("Ingrese los valores numericos deseados. Para finalizar digite un numero negativo");
        Scanner sc = new Scanner(System.in);
        int valor1;
        do {
            valor1 = sc.nextInt();
            myAL.add(valor1);
        } while (valor1 >= 0);
        for (Integer myAL1 : myAL) {
            System.out.print(myAL1+" . ");
        }
    }
}
