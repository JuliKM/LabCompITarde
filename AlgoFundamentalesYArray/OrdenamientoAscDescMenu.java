package TPAlgoritmosEsenciales;

import java.util.Scanner;

/**
 * Codifique mediante código JAVA los pseudocódigos de los algoritmos
 * fundamentales presentados en el apunte “Algoritmos Fundamentales”
 * correspondiente. Ordenamiento por inserción Algoritmo de la burbuja
 * Ordenamiento por selección Búsqueda secuencial
 */
public class Ej2_3_4 {

    public static void main(String[] args) {

        int vector[] = new int[20];
        llenarVector(vector);
        System.out.println("Ingrese asc para ordenar el arreglo de manera ascendente o desc para ordenarlo de manera descendente");
        String orden;
        Scanner sc = new Scanner(System.in);
        orden = sc.next();
        System.out.println("Ingrese por que metodo quiere ordenar:"
                + "\n1. insercion"
                + "\n2. burbuja"
                + "\n3. seleccion");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                insercion(orden, vector);
                break;
            case 2:
                burbuja(orden, vector);
                break;
            case 3:
                seleccion(orden, vector);
        }
        //secuencial(orden);
    }

    public static void insercion(String orden, int lista []) {
  //      int lista[] = {4, 5, 6, 7, 8, 0, 2, 5, 4, 1, 2};
        int cont = 0;
        if (orden.equalsIgnoreCase("asc")) {
            for (int i = 0; i < lista.length; i++) {
                int valor = lista[i];
                int j = i - 1;

                while (j >= 0 && lista[j] > valor) {
                    do {
                        lista[j + 1] = lista[j];
                        j--;
                        lista[j + 1] = valor;
                        cont++;
                    } while (j >= 0 && lista[j] > valor);
                }
            }
        } else if (orden.equalsIgnoreCase("desc")) {
            for (int i = 1; i < lista.length; i++) {
                int valor = lista[i];
                int j = i - 1;

                while (j >= 0 && lista[j] < valor) {
                    do {
                        lista[j + 1] = lista[j];
                        j--;
                        lista[j + 1] = valor;
                        cont++;
                    } while (j >= 0 && lista[j] < valor);
                }
            }
        }
            System.out.println("contador " + cont);
            for (int i = 0; i < lista.length; i++) {
                System.out.print(lista[i] 
                + " - ");
            
        }
    }

    public static void burbuja(String orden,int lista []) {
        int cont = 0;
      //  int lista[] = {4, 5, 6, 7, 8, 0, 2, 5, 4, 1, 2};
        int n = lista.length;
        boolean cambiado = false;
        if (orden.equalsIgnoreCase("asc")) {
            do {
                cambiado = false;
                for (int i = 1; i < n; i++) {
                    if (lista[i - 1] > lista[i]) {
                        int aux = lista[i - 1];
                        lista[i - 1] = lista[i];
                        lista[i] = aux;
                        cambiado = true;
                    }
                }
                cont++;
            } while (cambiado == true);
        } else if (orden.equalsIgnoreCase("desc")) {
            do {
                cambiado = false;
                for (int i = 1; i < n; i++) {
                    if (lista[i - 1] < lista[i]) {
                        int aux = lista[i - 1];
                        lista[i - 1] = lista[i];
                        lista[i] = aux;
                        cambiado = true;
                    }
                }
                cont++;
            } while (cambiado == true);

        }
        System.out.println("\ncontador" + cont);
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " - ");
        }
    }

    public static void seleccion(String orden, int lista []) {
        int cont = 0;
    //    int lista[] = {4, 5, 6, 7, 8, 0, 2, 5, 4, 1, 2};
        if (orden.equalsIgnoreCase("asc")) {
            for (int i = 0; i < lista.length; i++) {
                int minimo = lista[i];
                for (int j = i + 1; j < lista.length; j++) {
                    if ((lista[j]) < minimo) {
                        minimo = lista[j];
                        int posicion = j;
                        int aux = lista[i];
                        lista[i] = lista[posicion];
                        lista[posicion] = aux;
                        cont++;
                    }
                }
            }
        } else if (orden.equalsIgnoreCase("desc")) {
            for (int i = 0; i < lista.length; i++) {
                int minimo = lista[i];
                for (int j = i + 1; j < lista.length; j++) {
                    if ((lista[j]) > minimo) {
                        minimo = lista[j];
                        int posicion = j;
                        int aux = lista[i];
                        lista[i] = lista[posicion];
                        lista[posicion] = aux;
                        cont++;
                    }
                }
            }

        }
        System.out.println("\ncontador" + cont);
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " - ");
        }
    }

    public static void secuencial(String orden) {
        int a = 5;//Valor buscado
        int cont = 0;
        int lista[] = {4, 5, 6, 7, 8, 0, 2, 5, 4, 1, 2};
        int n = lista.length;
        boolean found = false;

        for (int i = 1; i < n; i++) {
            if (lista[i] == a) {
                found = true;
            }

            System.out.println("\nIs the value found?: " + found);
        }
    }

    public static void llenarVector(int vector[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los 20 valores para rellenar el vector");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = sc.nextInt();

        }
    }
}
