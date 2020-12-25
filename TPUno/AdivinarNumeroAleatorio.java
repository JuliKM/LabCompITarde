/*
 Codifique un programa de consola en Java que permita realizar las siguientes acciones:
 Generar un número aleatorio entre 0 y 100, para ello use la siguiente función:int x = new Double(Math.random() * 100).intValue();
 Una  vez  generado  el  número  codifique  la  lógica  necesaria  para  encontrar  el  número  aleatorio ayudando al usuario informando al mismo 
 si el número ingresado es mayor o menor al número aleatorio  buscado.  
 Una  vez  encontrado  el  número  muestre  la  cantidad  de  intentos  necesarios para lograrlo.
 */
package tpuno;

import java.util.Scanner;

public class EjCatorce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = new Double(Math.random() * 100).intValue();
        int guess;
        int cont=0;
        do {
            System.out.println("Ingrese un numero para intentar adivinar.");
            guess = sc.nextInt();
            if (guess < x) {
                System.out.println("Es muy bajo");
            } else  if (guess > x){
                System.out.println("Es muy alto");
            }
            cont++;
        } while (guess != x);
        System.out.println("Correcto, numero encontrado ("+x+") , cantidad de intentos: "+ cont);
    }
}
