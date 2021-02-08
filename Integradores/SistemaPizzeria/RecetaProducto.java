package globalPizzeria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RecetaProducto {

	static ArrayList<ProductoManufacturado> productos = new ArrayList<ProductoManufacturado>();
	static String[][] listaInsumos = { { "1000", "Harina", "Kg", "50" }, { "1001", "Huevos", "Un", "3" },
			{ "1002", "Tomate en Salsa", "Lt", "45" }, { "1003", "Queso Muzzarella", "Kg", "550" },
			{ "1004", "Queso Provolone", "Kg", "620" }, { "1005", "Queso Roquefort", "Kg", "650" },
			{ "1006", "Jamon Cocido", "Kg", "400" }, { "1007", "Salame", "Kg", "450" },
			{ "1008", "Lata Pimiento Morron", "Un", "130" }, { "1009", "Aceite", "Lt", "60" },
			{ "1010", "Carne Molida", "Kg", "180" }, { "1011", "Cebollas", "Kg", "60" },
			{ "1012", "Sal", "Kg", "75" } };
	/*
	 * [0] El código del Insumoa declarar. [1] La denominacióndel Insumo a declarar.
	 * [2] La unidad de medidadel Insumo siendo Kg(Kilogramos), Lt(Litros), Un
	 * (Unidad). [3] El precio de costo de c insumo x la unidad de medida asignada,
	 * ej la harina cuesta 50 pesos por Kg
	 */

	static String codigoInsumo;

	public static void main(String[] args) {

		System.out.println("COMIENZA PROGRAMA....");
		Scanner sc = new Scanner(System.in);

		String[][] obtenerArray;
		while (true) {
			//System.out.println("Comienza la carga de prod manufacturados...");
			ProductoManufacturado prodManu = new ProductoManufacturado();
			System.out.println("Ingrese el codigo del producto manufacturado");
			prodManu.setCodigo(sc.nextInt());
			System.out.println("Ingrese la denominacion del producto");
			prodManu.setDenominacion(sc.next());
			System.out.println("Ingrese el tiempo de fabricacion del producto");
			prodManu.setTiempoFabricacion(sc.nextInt());
			System.out.println("Ingrese el margen de ganancia del producto");
			prodManu.setMargenGanancia(sc.nextDouble());
			System.out.println("Ingrese la cantidad de insumos necesarios para el producto manufacturado");
			int cantidadInsumos = validarRango(1, 13);
			// Aca agregamos + 1 cuando creamos el array paara evitar el titulo
			String[][] pasarArray = new String[(cantidadInsumos + 1)][4];
			prodManu.setInsumos(pasarArray);
			
			obtenerArray = prodManu.getInsumos();
			obtenerArray[0][0] = "Código ";
			obtenerArray[0][1] = "Insumo";
			obtenerArray[0][2] = "Cantidad/U. de medi";
			obtenerArray[0][3] = "Precio Costo Calculado";
			for (int i = 1; i < obtenerArray.length; i++) {

				buscarValorEnMatriz(codigoInsumo, listaInsumos);
				System.out.println("Ingrese la cantidad del insumo para la elaboracion del producto");
				String coso = Double.toString(sc.nextDouble());
				String cantidadInsumo =  coso;

				asignarColumnas(obtenerArray, codigoInsumo, cantidadInsumo, i);
			}
			prodManu.setInsumos(obtenerArray);
			if (productos == null)
				new ArrayList<ProductoManufacturado>();
			productos.add(prodManu);
			System.out
					.println("Ingrese SALIR para interrumpir la carga de productos. Cualquier otra tecla para seguir");
			String rta = sc.next();
			if (rta.toUpperCase().equals("SALIR"))
				break;
		}

		for (ProductoManufacturado prod: productos) {
			System.out.println(completarConEspacios("Codigo Producto: ")+prod.getCodigo());
			System.out.println(completarConEspacios("Producto: ")+prod.getDenominacion());
			System.out.println(completarConEspacios("Tiempo Elaboracion: ")+prod.getTiempoFabricacion());
			System.out.println("Insumos: ");
			mostrarArregloString(prod.getInsumos());
			System.out.println(completarConEspacios("Costo Total Producto:")+prod.costoTotalProducto(prod.getInsumos()));
			System.out.println(completarConEspacios("Margen de Ganancia")+prod.getMargenGanancia());//falta completar
			System.out.println(completarConEspacios("Precio de Venta Final:")+prod.precioVentaProducto());
			System.out.println("----------------------------------------");
		}

		System.out.println("--------------FINALIZA PROGRAMA----------");
	}

	private static void asignarColumnas(String[][] obtenerArray, String codigoInsumo, String cantidadInsumo,
			int iterador) {

		obtenerArray[iterador][0] = codigoInsumo;
		obtenerArray[iterador][1] = devuelveValorRespectoAOtroMatriz(codigoInsumo, listaInsumos, 0, 1);
		String unidad = devuelveValorRespectoAOtroMatriz(codigoInsumo, listaInsumos, 0, 2);
		obtenerArray[iterador][2] = (cantidadInsumo+" "+unidad);	
		double calculo = Double.valueOf(cantidadInsumo)
				* Double.valueOf(devuelveValorRespectoAOtroMatriz(codigoInsumo, listaInsumos, 0, 3));
		obtenerArray[iterador][3] = Double.toString(calculo);
	}

	public static int validarRango(int min, int max) {
		Scanner sc = new Scanner(System.in);
		int valorValidado;
		int tamano;
		do {
			System.out.println("Ingrese un valor entero mayor a " + min + " y menor o igual a " + max);
			tamano = sc.nextInt();
			if (tamano <= min || tamano > max)
				System.out.println("Valor fuera de rango ");
		} while (tamano <= min || tamano > max);
		valorValidado = tamano;
		return valorValidado;
	}

	public static String buscarValorEnMatriz(String valor, String matrix[][]) {
		Scanner sc = new Scanner(System.in);
		boolean found = false;
		System.out.println("Ingrese el codigo del insumo a cargar");
		codigoInsumo = sc.next();
		for (int i = 0; i < matrix.length; i++) {

			if (codigoInsumo.equals(matrix[i][0])) {
				System.out.println("\nEl valor " + codigoInsumo + " es correcto");
				found = true;
				break;
			}
		}

		if (found == true)
			return codigoInsumo;
		if (found == false) {
			System.out.println(
					"\nEl valor  (" + codigoInsumo + "), no es correcto. Ingrese otro valor: ");
			// codigoInsumo = sc.next();
			return buscarValorEnMatriz(valor, matrix);
		}
		return "return al pedo";
	}

	public static String devuelveValorRespectoAOtroMatriz(String valor, String matrix[][], int columnaOrigen,
			int columnaDestino) {
		// boolean found = false;
		String devolverValor = " ";
		for (int i = 0; i < matrix.length; i++) {
			if ((matrix[i][columnaOrigen]).equals(valor)) {
				devolverValor = matrix[i][columnaDestino];
			}

		}
		return devolverValor;

	}

	public static void mostrarArregloString(String arreglo[][]) {
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[0].length; j++) {
				System.out.print(completarConEspacios(arreglo[i][j]) + " |  ");
			}
			System.out.println(" ");
		}
	}

	public static String completarConEspacios(String cadena) {
		int cantidadEspacios = 20 - cadena.length();
		for (int i = 0; i < cantidadEspacios; i++) {
			cadena += " ";
		}
		return cadena;
	}

}
