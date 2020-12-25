/*Convertir  una  frase  a  mayúsculas  o  minúsculas,  que  daremos  opción  a  que  el usuario lo pida y mostraremos el resultado por pantalla
 */
package TPDos;

import java.util.Scanner;

public class Ej_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Desea el texto en mayúsculas(1) o minúsculas(2)?");
        String texto = "Là-bas, au Connemara on sait tout le prix du silence.\n"
                + "Là-bas, au Connemara on dit que la vie c'est une folie\n"
                + "et que la folie ça se danse.";
        int resp = sc.nextInt();
        String transformado = "";
        if (resp == 1) {
            transformado = texto.toUpperCase();
        } else if (resp == 2) {
            transformado = texto.toLowerCase();
        } else {
            System.out.println("Opcion no valida");
        }
         System.out.println(transformado);
    }
}
