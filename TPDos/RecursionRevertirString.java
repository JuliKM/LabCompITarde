
package TPDos;

import java.util.Scanner;

/**
Crea  un  programa  donde  se  pida  el ingreso  de  una  cadenay por  medio  de  recursiónmostrarla cadenade forma inversa.
* Ejemplo: Ingreso “computadora de escritorio”Invertir cadena “oirotircse ed arodatupmoc”
 */
public class Ej_23 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = sc.nextLine();
        String anedac = darVuelta(cadena);
        System.out.println("La cadena al reves es: "+anedac);
        
    }
    
    public static String darVuelta(String cadena){
      
        String anedac = "";
        if (cadena.length()==1){
            return cadena;
        }else{ 
           return cadena = darVuelta(cadena.substring(1))+cadena.charAt(0);
        }
        
        
       
    }
}
