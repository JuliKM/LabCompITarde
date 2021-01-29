package colecciones1;

public class Celda {
	 int fila;
	 int columna;
	 String valor;
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Celda(int fila, int columna, String valor) {
		super();
		this.fila = fila;
		this.columna = columna;
		this.valor = valor;
	}
	public Celda() {
		super();
	}
	 
	 
	 
	 
}
