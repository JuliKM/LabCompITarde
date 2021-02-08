package globalPizzeria;

import java.util.Iterator;

public class ProductoManufacturado {

	private int codigo;
	private String denominacion;
	private int tiempoFabricacion;
	private String[][] insumos;
	private double margenGanancia;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public int getTiempoFabricacion() {
		return tiempoFabricacion;
	}

	public void setTiempoFabricacion(int tiempoFabricacion) {
		this.tiempoFabricacion = tiempoFabricacion;
	}

	public String[][] getInsumos() {
		return insumos;
	}

	public void setInsumos(String[][] insumos) {
		this.insumos = insumos;
	}

	public double getMargenGanancia() {
		return margenGanancia;
	}

	public void setMargenGanancia(double margenGanancia) {
		this.margenGanancia = margenGanancia;
	}

	public double costoTotalProducto(String arreglo[][]) {
		double costoTotal = 0;
		for (int i= 1; i < arreglo.length; i++) {
			costoTotal += Double.valueOf(arreglo[i][3]);
		}
		
		return costoTotal;
	}
	
	public double precioVentaProducto(){
		double precioVenta = 0;
			precioVenta = costoTotalProducto(insumos)*(1+margenGanancia/100);
		
		
		
		
		return precioVenta ;
	}

}
