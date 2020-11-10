package TP3Colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Hash1Map {

    public static void main(String[] args) {
        HashMap<String, Long> agenda = new HashMap<String, Long>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese que opcion desea hacer:\n1. Cargar datos en la agenda.\n2. Buscar Telefono por nombre\n3. Listar Agenda \n4. Salir");

        int resp = sc.nextInt();
        do {
            switch (resp) {
                case 1:
                    cargarDatos(agenda);
                    break;
                case 2:
                    buscarTelNombre(agenda);
                    break;
                case 3:
                      listarAgenda(agenda);
                    break;
                default:
                    System.out.println("Opcion4 no valida");
            }
             System.out.println("Ingrese que opcion desea hacer:\n1. Cargar datos en la agenda.\n2. Buscar Telefono por nombre\n3. Listar Agenda \n4. Salir");
            resp=sc.nextInt();
        } while (resp != 4);
    }

    public static HashMap<String, Long> cargarDatos(HashMap<String, Long> agenda) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Si desea ingresar un nombre presione un numero");
        int rta = sc.nextInt();
        do {
            System.out.println("Ingrese el nombre completo de la persona");
            String nombre = sc.next();
            System.out.println("Ingrese el telefono de la persona");
            long tel = sc.nextLong();
            if (agenda.containsKey(nombre) == true) {
                System.out.println("Ese usuario ya esta ingresado");
            } else {
                agenda.put(nombre, tel);
            }

            System.out.println("Si desea ingresar otro nombre presione 8");
            rta = sc.nextInt();
        } while (rta == 8);
        return agenda;
    }

    public static void buscarTelNombre(HashMap<String, Long> agenda) {
        Scanner sc = new Scanner(System.in);
        Long nro = 0L;
        System.out.println("Ingrese el nombre que desea consultar");
        String nombre = sc.nextLine();
        if (agenda.containsKey(nombre) == false) {
            System.out.println("La persona buscada no se encuentra en la agenda");
        } else {
            agenda.get(nombre);
            nro = agenda.get(nombre);
            System.out.println("El telefono de " +nombre+ "es "+ nro);
        }
    
    }
    public static void listarAgenda(HashMap<String, Long> agenda){
                if (agenda.isEmpty()) {
            System.out.println("La agenda está vacia. Debe agregar al menos a una persona par apoder usar esta opcion\n");
        } else {
            System.out.println("Agenda:: \n");
            for (String o : agenda.keySet()) {
                String nombre_persona = "Nombre: " + o;
                System.out.println(nombre_persona + "\nTelefono: " + agenda.get(o));

                System.out.println("------------------------");
            }
        }
    }

}
