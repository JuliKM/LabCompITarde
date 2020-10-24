package TPCollecciones;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Codifiqueuna aplicación que: a) lea 20 números decimales ingresados por
 * teclado por el usuario y los coloque en un ArrayList<Double>. 
 * b) determine y muestre el mayor de los números en el arreglo 
 * c) determine y muestre el menor
 * de los números del arreglocalcule y muestre el rango (diferencia entre el
 * mayor y el menor) de los elementos en el arreglo
 */
public class Ej_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Double> dobleAL  = new ArrayList();
        System.out.println("Ingrese 20 numeros decimales");
        Double mayor = null;
        Double menor = null;
        for (int i = 0; i < 20; i++) {
            Double nro = sc.nextDouble();
            dobleAL.add(nro);
            if (mayor==null){
                mayor=nro;
        }
            if (menor==null){
                menor=nro;
        }
            if (menor>nro){
                menor=nro;
            }
            if (mayor<nro){
                mayor=nro;
            }
        }
        
        System.out.println("Mayor: "+mayor+" , Menor: "+menor);
        System.out.println("Rango: "+(mayor-menor));
    }
}
