package TPAlgoritmosEsenciales;

/**
 * Codifique mediante código JAVA los pseudocódigos de los algoritmos
 * fundamentales presentados en el apunte “Algoritmos Fundamentales”
 * correspondiente. Ordenamiento por inserción Algoritmo de la burbuja
 * Ordenamiento por selección Búsqueda secuencial
 */
public class Ej2 {

    public static void main(String[] args) {
        insercion();
        burbuja();
        seleccion();
        secuencial();
    }

    public static void insercion() {
        int lista[] = {4, 5, 6, 7, 8, 0, 2, 5, 4, 1, 2};
        int cont = 0;
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
        System.out.println("contador " + cont);
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " - ");
        }
    }

    public static void burbuja() {
        int cont = 0;
        int lista[] = {4, 5, 6, 7, 8, 0, 2, 5, 4, 1, 2};
        int n = lista.length;
        boolean cambiado = false;
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
        System.out.println("\ncontador" + cont);
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " - ");
        }
    }

    public static void seleccion() {
        int cont = 0;
        int lista[] = {4, 5, 6, 7, 8, 0, 2, 5, 4, 1, 2};
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
        System.out.println("\ncontador" + cont);
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " - ");
        }
    }

    public static void secuencial() {
        int a = 5;//Valor buscado
        int cont = 0;
        int lista[] = {4, 5, 6, 7, 8, 0, 2, 5, 4, 1, 2};
        int n = lista.length;
        boolean found = false;
        for (int i = 1; i < n; i++) {
            if (lista[i] == a) {
                found = true;
            }
        }
        System.out.println("\nIs the value found?: " + found);
    }
}
