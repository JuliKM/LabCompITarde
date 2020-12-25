/*
 Indique cual es la diferencia entre los datos primitivos (por valor) ejemplo el int y su contraparte por referencia ejemplo Integer
 Un tipo primitivo es un dato elemental y carece de métodos, mientras que un objeto es una entidad compleja y dispone de métodos. Por otro lado, de acuerdo con la especificación de Java, es posible que necesitemos utilizar dentro de un programa un objeto que “porte” como contenido un número entero. 
 Indique que sucede si realizo la siguiente declaración de variable:int numero = null;¿Quédebo modificar para poder asignar null a la variabl
 Debo modificarlo a Integer para poder asignarlo como objeto. I.e.     Integer numero = null;
 Como transformo una variable tipo Double a una variable tipo double
        Double var = 0.5;
        double var2 = var;
 Cree una clase FuncionesPrograma y codifique una función estáticaque reciba como parámetro una fecha de tipo Date y retorne la fecha como una cadena.
public static String getFechaString(Date fecha){..........} Cree una clase Principal que contenga un método main y haga uso de la función getFechaString
 */
package TPDos;

import java.time.Instant;
import java.util.Date;

public class Ej_17 { 
   public static void main(String[] args) {
      //  FuncionesPrograma fp = new FuncionesPrograma();
       //Ejercicio 17
       
        String hoy = FuncionesPrograma.getFechaString(Date.from(Instant.EPOCH));
        System.out.println("Fecha: "+hoy);
        //Ejercicio 18
        Date date = FuncionesPrograma.getFechaDate(03, 07, 1990);
        System.out.println("Fecha formato date: "+date);
        
   
   
   }
}