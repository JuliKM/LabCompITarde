/*
Cree  una  clase  OperacionMatematica  con  dos  atributos  numéricos  decimales, valor1   y   valor2   y   un   atributo   String   de   nombre   operación.
Cree   los correspondientes métodos get/set.
 */
package TPDos;

/**
Cree   una   clase   Calculo   que   contenga  un   método   main,   
* donde   cree   una instancia  de  la  clase  OperacionMatematica,  asigne  2  valores  para  las  variablesd e la instancia y 
* ejecute la función aplicarOperacion, pasando como parámetro primero “+”, después “-”, a continuación “*” y finalmente “/”. 
* Muestre por pantalla el resultado de las operaciones. */
public class Calculo {
    public static void main(String[] args) {
        OperacionMatematica om = new OperacionMatematica(10,5);
        double suma = om.aplicarOperacion("+");
        double resta = om.aplicarOperacion("-");
        double multi = om.aplicarOperacion("*");
        double div = om.aplicarOperacion("/");
        System.out.println("Los numeros son 10 y 5:"
                + "\nLa suma es: "+suma+", \nla resta es: "+resta+", \nla division es: "+div+", \nla multiplicacion es: "+multi);
    }
}
