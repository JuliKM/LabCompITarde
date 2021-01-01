package arreglosMultidimensionales;

import java.util.Scanner;

public class Ej_5_Golosinas {

	public static void main(String[] args) {

		String[][] golosinas = { { "KitKat", "32", "10" }, { "Chicles", "2", "50" },
				{ "Caramelos de Menta", "2", "50" }, { "Huevo Kinder", "20", "10" }, { "Cheetos", "30", "10" },
				{ "Twix", "26", "10" }, { "M%M's", "35", "10" }, { "Papas Lays", "40", "20" },
				{ "Milkybar", "30", "10" }, { "Alfajor Tofi", "20", "15" }, { "Lata coca", "50", "20" },
				{ "Chitos", "45", "10" } };
		String[][] golosinasInicial = { { "KitKat", "32", "10" }, { "Chicles", "2", "50" },
				{ "Caramelos de Menta", "2", "50" }, { "Huevo Kinder", "20", "10" }, { "Cheetos", "30", "10" },
				{ "Twix", "26", "10" }, { "M%M's", "35", "10" }, { "Papas Lays", "40", "20" },
				{ "Milkybar", "30", "10" }, { "Alfajor Tofi", "20", "15" }, { "Lata coca", "50", "20" },
				{ "Chitos", "45", "10" } };
		int pxq=0;
		menu(golosinas, golosinasInicial, pxq);

	}

	public static void menu(String golosinas[][], String golosinasInicial[][], int pxq) {
		Scanner sc = new Scanner(System.in);
		int sumapxq=0;
		int accion ;
		System.out.print("Bienvenido! ");
		do {
		System.out.println("Indique la accion que desea realizar: " + "\n1. Pedir  golosina"
				+ "\n2. Mostrar  golosinas existentes" + "\n3. Rellenar  golosinas (Solo Admin) "
				+ "\n4. Apagar  maquina");
		 accion = sc.nextInt();
		switch (accion) {
		case 1:
			entregarGolosina(golosinas);
			break;
		case 2: 
			mostrarGolosina(golosinas);
			break;
		case 3: 
			pxq = rellenarGolosinas(golosinas, pxq);
			sumapxq += pxq; 
			
			break;
		case 4: 
			apagarMaquina(golosinasInicial, golosinas, sumapxq);
		
			break;
		default:
			System.out.println("Opcion no valida");
		}
		} while (accion!=4);
	}

	public static int entregarGolosina(String golosinas[][]) {
		MetodosUtiles mu = new MetodosUtiles();
		System.out.println("Ingrese la golosina que desea:");
		int opcion = mu.validarRango(1, 12);
		int stockRestante = Integer.parseInt(golosinas[(opcion) - 1][2]);
		if (stockRestante > 0) {
			stockRestante--;
			golosinas[(opcion) - 1][2] = String.valueOf(stockRestante);
			System.out.println("Que lo disfrute");
		} else
			System.out.println("No hay stock de ese producto. Seleccione otra golosina");
		return stockRestante;
	}

	public static void mostrarGolosina(String golosinas[][]) {
		MetodosUtiles mu = new MetodosUtiles();
		System.out.println("Golosina             | Precio                | Stock actual"
				+ "\n---------------------|-----------------------|------------------------");
		mu.mostrarArregloString(golosinas);
	}

	public static int rellenarGolosinas(String golosinas[][], int pxq) {
		MetodosUtiles mu = new MetodosUtiles();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la contraseña para ingresar al sistema");
		String pass = sc.next();
		boolean validacion = mu.validarPassword(pass, "AdminXYZ");
		if (validacion == true) {
			System.out.println("Ingrese la posicion de la golosina a recargar");
			int posicion = mu.validarRango(1, 12);
			System.out.println("Ingrese la cantidad a agregar");
			int cantidad = sc.nextInt();
			golosinas[(posicion) - 1][2] = String.valueOf(Integer.parseInt(golosinas[(posicion) - 1][2]) + cantidad);
			pxq = Integer.parseInt(golosinas[(posicion) - 1][1] )*cantidad;
			System.out.println("Fueron agregados "+cantidad +" items en la posicion "+posicion);
		} else
			System.out.println("No puede realizar la accion deseada");
		return pxq;
	}

	public static void apagarMaquina(String golosinasInicial[][], String golosinas[][], int sumapxq) {

		int suma = 0;
		for (int i = 0; i < golosinas.length; i++) {
		
			int difStock = Integer.parseInt(golosinasInicial[i][2]) - Integer.parseInt(golosinas[i][2]);
			
			int pxq = (Integer.parseInt(golosinasInicial[i][1])) * difStock;
			
			suma = suma + pxq;
		} suma = suma+sumapxq;
		System.out.println("Venta total: $" + suma + " pesos crocantes.");
		System.out.println("-------PROGRAMA FINALIZADO------------");
	}

}
