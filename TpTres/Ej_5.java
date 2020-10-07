/*
 5.Escriba una aplicación para almacenar aleatoriamente20 números enterospositivos pares del 1 al 100, 
 de los cuales se desea saber: 
 a) su promedio aritmético
 b) cuántos de los números son iguales al promedio aritmético
 c) cuántos de los números son mayores que el promedio aritméticod) cuántos de los números son menores que el promedio aritmético
 */
package TpTres;

import java.util.Arrays;

public class Ej_5 {

    public static void main(String[] args) {
        int[] matriz = new int[20];
        for (int i = 0; i < 20; i++) {

            matriz[i] = (int) (Math.random() * 100) + 1;
            System.out.print(" - " + matriz[i]);
        }
        int prome = prom(matriz);
        System.out.println("prom" + prome);
        //System.out.println("Arreglo Iguales: " + .toString());
        System.out.println("1"+Arrays.toString(menores(matriz, prome)));
        System.out.println("2"+Arrays.toString(mayores(matriz, prome)));
        System.out.println("3"+Arrays.toString(iguales(matriz, prome)));
        //System.out.println("Arreglo Mayores: " + .toString());
        //System.out.println("Arreglo Menores: " + menores(matriz, prome).toString());
    }

    private static int prom(int[] matriz) {
        //Prom aritmetico
        int suma = 0;
        for (int i = 0; i < 20; i++) {
            suma += matriz[i];
        }
        int prom = suma / 20;

        return prom;
    }

    private static int[] iguales(int[] matriz, int prome) {
        prome = (int) prome;
        int n = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] == prome) {
                n++;
            }
        }
        int arregloIguales[] = new int[n];
        System.out.println("Iguales");
        int j=0;
        while ( j < matriz.length){
            for (int k = 0; k < arregloIguales.length; k++) {
                if (matriz[j] == prome) {
                    arregloIguales[k] = matriz[j];
                    j++;
                    
                }
            }
        }
        for (int i = 0; i < arregloIguales.length; i++) {
            System.out.print("-" + arregloIguales[i]);
        }
        return arregloIguales;
    }

    private static int[] mayores(int[] matriz, int prome) {
        prome = (int) prome;
        int n = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] > prome) {
                n++;
               
               
            }
        }System.out.println("prome"+prome); 
        int arregloMayores[] = new int[n];
        int k=0;
        while (k < arregloMayores.length){
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j] > prome) {
                    arregloMayores[k] = matriz[j];
                   k++;
                   
                    //f (k==arregloMayores.length) k--;
                }//System.out.print("it 1 ");
            }//System.out.print("it 2");
        }//System.out.print("it 3");
        System.out.println("Mayores");
        for (int i = 0; i < arregloMayores.length; i++) {
            System.out.print("-" + arregloMayores[i]);
        }
        return arregloMayores;
    }

    private static int[] menores(int[] matriz, int prome) {
        prome = (int) prome;
        int n = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] > prome) {
                n++;
                //System.out.println("N"+n);
            }
        }
        int arregloMenores[] = new int[n];
        int k=0;
        while (k < arregloMenores.length) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("index1"+arregloMenores.length);
                System.out.println("index matris"+matriz.length);
                System.out.println("While"+k);
                System.out.println("for"+j);
              if (matriz[j] < prome) {
                    arregloMenores[k] = matriz[j];
                   k++;
                    System.out.println("Sumamos un valor a arreglo mayores");
                    //System.out.print("it 1 ");
                   // if (k==arregloMenores.length) k--;
                }
   
               
//System.out.print("it 2");
            }//System.out.print("it 3");
        }
        /*int arregloMenores[] = new int[n];
        for (int j = 0; j < arregloMenores.length; j++) {
            for (int k = 0; k < matriz.length; k++) {
                if (matriz[k] < prome) {
                    arregloMenores[j] = matriz[k];
                    j++;
                }
                
            }
        }*/
        System.out.println("Menores");
        for (int i = 0; i < arregloMenores.length; i++) {
            System.out.print("-" + arregloMenores[i]);
        }
        return arregloMenores;
    }

}
