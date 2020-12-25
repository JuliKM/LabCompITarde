/*
 Desarrolle  un  programa  que  ayude  a  una  cajera  a  determinar  el  número  de billetes   y   monedas   que   se   necesitan   de   cada   una   de   las   
 siguientes denominaciones 200, 100, 50, 20, 10, 5, 2 y 1, y monedas de 0.50, 0.25, 0.10 y 0.05  centavos  para  una  cantidad  de  dinero  dada.  
 Ejemplo  si  la  cantidad  es 1390,55  se  necesitan  6  billetes  de  200,  1  billete  de  100,  1  billete  de  50,  2 billetes de 20, 
 1 moneda de 0.50 y una moneda de 0.05 centavos.  
 */
package TPDos;

import java.util.Scanner;

public class Ej_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a retirar de la caja");
        double monto = sc.nextDouble();
        int dosc = (int) monto / 200;
        double resto = (monto - dosc * 200);
        int cien = (int) resto / 100;
        resto = resto - cien * 100; 
        int cincuenta = (int) (resto) / 50;
        resto = resto - cincuenta * 50; 
        int veinte = (int) (resto) / 20;
        resto = resto -veinte*20;
        int diez = (int) (resto) / 10;
        resto = resto -diez*10;
        int cinco = (int) (resto) / 5;
        resto = resto -cinco*5;
        int dos = (int) (resto) / 2;
        resto = resto -dos *2;
        int uno = (int) (resto);
        resto = resto-uno;
        resto = Math.round(resto*100);
        //Redondeo porque en algun momento los decimales se desvirtuan
        int cent50 =  (int) (resto/ 50);
        resto = resto - cent50*50;
        int cent25 = (int) (resto) / 25;
        resto = resto - cent25*25;
        int cent10 = (int) (resto) / 10;
        resto = resto - cent10*10;
        int cent5 = (int) (resto)/5 ;
        
        System.out.println("Billetes: \n200: " + dosc + "\n100: " + cien + "\n50: " + cincuenta + "\n20: " + veinte + "\n10: " + diez + "\n5: " + cinco + "\n2: " + dos + "\n1: " + uno
                + "\nMonedas:\n50 centavos: " + cent50 + "\n25 centavos: " + cent25 + "\n10 centavos: " + cent10 + "\n5 centavos: " + cent5);

    }

}
