package TP2Colecciones.Ej_1;

import java.util.Scanner;

public class CargaDDJJStockAgroquimico {

    String[][] agroquimicos = {{"1001", "2ECJebAgro", "A"},
    {"1002", "D 60 GREEN CROPS", "V"}, {"1003", "ESTER 97", "A"}, {"1004", "AMINA ICONA SL", "A"}, {"1005", "ABAMECTINA AGRO", "A"}, {"1006", "FURACARB 31 TS", "R"}, {"1007", "FURAFARM 48 F", "R"}, {"1008", "ACETOCLOR ASSA", "A"}, {"1009", "GLIFOSATO ACTIVE SIL", "R"}, {"1010", "ABRIGO PLUS", "V"}};

    public static void main(String[] args) {
        DDJJStockAgroquimico ddjjsa = new DDJJStockAgroquimico();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los datos que se solicitan a continuacion");
        String RS;
        do {
            System.out.println("Ingrese Razon social. No puede ser vacia");
            RS = sc.nextLine();
        } while ("".equals(RS));
        long cuit;
        do {
            System.out.println("ingrese CUIT, 11 digitos");
            cuit = sc.nextLong();
        } while (cuit < 1000000000);//|| cuit>9999999999); Esta validacion revisarla por el tipo de dato long
        int anioDeclaracion;
        do {
            System.out.println("Ingrese anio de declaracion. Igual o menos al anio en curso");
            anioDeclaracion = sc.nextInt();
        } while (anioDeclaracion >= 2020);
        int mesDeclaracion;
        do {
            System.out.println("Ingrese mes de declaracion. Menor al mes actual");
            mesDeclaracion = sc.nextInt();

        } while (mesDeclaracion > 13); //no  supere  el  mes  y  año  actual 
        int cantAgroqcos;
        do {
            System.out.println("Ingrese la cant de agroqcos a informar. Hasta 10");
            cantAgroqcos = sc.nextInt();
        } while (cantAgroqcos >= 10);
        
        
        /*Solicitar al usuario la cantidad de agroquímicosque se desean informar.
         Validarque el  número  ingresado  sea  mayor  a  cero  y  menor  o  igual  a  10.  
         Aplique  el  valor ingresado  por  el  usuario  para  inicializar  la  variable detallesAgroquimicode  la  clase DDJJStockAgroquimicocon  el  tamaño  indicado: 
         Ejemplosi  se  ingresa  5  el  array tendrá un tamaño de 5 filas por 6 columnas.
        
        
         */
    }

}
