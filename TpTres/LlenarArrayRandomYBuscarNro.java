package arreglosUnidimensionales;

/*
 * Realice  una búsqueda  secuencial  en  un  arreglo  unidimensional  de  tamaño  50generado aleatoriamentemediante la función java random. 
 * Realice una búsqueda secuencialde la siguienteforma: 
 * -se lee el valor que se desea buscar, 
 * -se compara la primera posición; 
 * -si soniguales, -fin de la búsqueda. 
 * -De lo contrario, compararlo con la segundaposición, y así sucesivamente. 
 * -Si se llega al final del arreglo y no se encontró elvalor, debe indicarlo con un mensaje apropiado. 
 * -Si se encuentra, se debeespecificar la posición que ese valor ocupa en el arreglo por primera vez
 * */
public class Ej_6 {

	public static void main(String[] args) {
		int myArray[] = new int[50];
		int valorABuscar = (int) (Math.random() * 100) + 1;
		boolean existeElNro = false;
		System.out.println("El valor a buscar es " + valorABuscar);
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < myArray.length; i++) {
			
			if (myArray[i] == valorABuscar) {
				System.out.println("Fin de la busqueda, se encuentra en la posicion " + i + " del array");
				existeElNro = true;
				break;
			}
		}
		if (existeElNro==false) System.out.println("El numero no se encontro");
	}

}
