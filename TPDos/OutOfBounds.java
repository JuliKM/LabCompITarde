/*
Si  se  asigna un  valor    a una  variable  fuera  de  rango  (mayor  de  lo  establecido) ¿Qué ocurre? ¿Existe alguna forma de resolverlo? Ejemplifique

*/
package TPDos;

/**
 *
 * @author DELL
 */
public class Ej_2 {
    public static void main(String[] args) {
        byte bait = (byte) 1025;
        //Lo que sucede es que se puede castear el valor. Sin embargo el valor sera transformado. Otra solución es cambiar el tipo de dato al dato que corresponda. 
        //byte nbait = 501; Este valor lo comento porque si no lanza una excepcion.
        System.out.println("Valor original 1025. Valor transformado a Byte : "+bait);
    }
   
}
