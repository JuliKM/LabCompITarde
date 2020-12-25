/*Pide  un  número  por  teclado  e  indica  si  es  unnúmero  primo  o  no.  \
 Un  número  primo  es  aquel solo  puede  dividirse  entre  1  y símismo.  
 Por  ejemplo:  25  no  es  primo,  ya  que  25  es  divisible entre 5, sin embargo, 17 si es primo.
 Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese númerohasta 1.
 NOTA: Si se introduce un númeromenor o igual que 1, directamente es no primo.*/
package tpuno;

import java.util.Scanner;

public class EjTrece {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int nro = sc.nextInt();
        int cont = 1;
        if (nro > 1) {
            double raiz = Math.sqrt(nro);
            System.out.println("raiz" + raiz);
            for (int i = (int) raiz; i >= 1; i--) {
                if (nro % i == 0) {
                    cont++;
                    System.out.println("raiz" + raiz);
                    System.out.println("cont" + cont);
                }
            }
            if (cont == 2) {
                System.out.println("El numero " + nro + " es primo");
            } else {
                System.out.println("El numero " + nro + " no es primo");
            }

        } else {
            System.out.println("El numero " + nro + " no es primo");
        }

    }
}
