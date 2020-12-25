/*
Dada una cadena, extraer la cuarta y quinta letra usando el método substring
 */
package TPDos;

public class Ej_12 {
    
    public static void main(String[] args) {
    String cadena="esta es la cadena";
    int longi=cadena.length();
    String sub = cadena.substring(0, longi-2);
        System.out.println("La cadena es: " +cadena+"\nLa subcadena es: "+sub);    
    }
            
    
}
