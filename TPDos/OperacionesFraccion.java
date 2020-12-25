package TPDos;

import java.util.Scanner;

/*
 Cree  una  clase OperacionesFraccionque  contenga  un  método  main  donde  se solicite  al  usuario  el  ingreso  de  
 4  valores  numéricos  enteros  con  los  cuales  se crearan 2 objetos Fracción y 
 finalizada la creación de los mismos se ejecutaran los  4 métodosimplementados  anteriormente
 asignando  el  resultado  a  una nueva  variable  de  tipo  Fracción  ymostrando  por  pantalla  el  resultado  de  las operaciones realizadas
 */
public class OperacionesFraccion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 4 valores numericos enteros para formar las facciones en el sgte orden (f1 numerador, f1 denominador, f2 numerador, f2 denominador)");
        Fraccion f1 = new Fraccion(sc.nextInt(), sc.nextInt());
        Fraccion f2 = new Fraccion(sc.nextInt(), sc.nextInt());
        Fraccion suma = f1.sumarFracciones(f1, f2);
        Fraccion resta = f1.restarFracciones(f1, f2);
        Fraccion multi = f1.multiplicarFracciones(f1, f2);
        Fraccion div = f1.dividirFracciones(f1, f2);
        System.out.println("Los resultados son: ");
        System.out.println("sumar: " + suma.toString());
        System.out.println("restar: " + resta);
        System.out.println("multiplicar: " + multi);
        System.out.println("dividir: " + div);
    }

}
