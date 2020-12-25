package TPDos;

public class OperacionMatematica {
// dos  atributos  numéricos  decimales, valor1   y   valor2   y   un   atributo   String   de   nombre   operación.

    private double valor1;
    private double valor2;
    private String operacion;

    private double sumarNumeros(double valor1, double valor2) {
        return valor1 + valor2;
    }

    private double restarNumeros(double valor1, double valor2) {
        return valor1 - valor2;
    }

    private double multiplicarNumeros(double valor1, double valor2) {
        return valor1 * valor2;
    }

    private double dividirNumeros(double valor1, double valor2) {
        return valor1 / valor2;
    }
    //El quinto método será el siguiente

    public double aplicarOperacion(String operacion) {
    
        double resultado =0;
        switch (operacion) {
            case "+":
                resultado = sumarNumeros(getValor1(), getValor2());
                break;
            case "-":
                resultado = restarNumeros(getValor1(), getValor2());
                break;
            case "/":
                resultado = dividirNumeros(getValor1(), getValor2());
                break;
            case "*":
                resultado = multiplicarNumeros(getValor1(), getValor2());
                break;
        }
        return resultado;
    }

    public OperacionMatematica(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
