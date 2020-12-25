package TPDos;

/**
 * EJ 20 Cree una clase Fraccióncon dos atributos numéricos enteros, numerador y
 * denominador. Agregue un constructor sobrecargado (debe contener como
 * parámetros el numerador y el denominador) que cree el objeto Fracción
 * correspondiente. Agregue a la clase los siguientes 4 métodose implemente los
 * mismos:
 */
public class Fraccion {

    int numerador;
    int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2) {

        Fraccion fraccion1 = new Fraccion(f1.numerador, f1.denominador);
        Fraccion fraccion2 = new Fraccion(f2.numerador, f2.denominador);
        int resden = fraccion1.denominador * fraccion2.denominador;
        int resnum = ((resden / fraccion1.denominador) * fraccion1.numerador) + ((resden / fraccion2.denominador) * fraccion2.numerador);
        //simplificar(pendiente!!)
        Fraccion resultado = new Fraccion(resnum, resden);
        return resultado;
    }

    public Fraccion restarFracciones(Fraccion f1, Fraccion f2) {
         Fraccion fraccion1 = new Fraccion(f1.numerador, f1.denominador);
        Fraccion fraccion2 = new Fraccion(f2.numerador, f2.denominador);
        int resden = fraccion1.denominador * fraccion2.denominador;
        int resnum = ((resden / fraccion1.denominador) * fraccion1.numerador) - ((resden / fraccion2.denominador) * fraccion2.numerador);
        //simplificar(pendiente!!)
        Fraccion resultado = new Fraccion(resnum, resden);

        return resultado;

    }

    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2) {
        Fraccion fraccion1 = new Fraccion(f1.numerador, f1.denominador);
        Fraccion fraccion2 = new Fraccion(f2.numerador, f2.denominador);
        int resden = fraccion1.denominador * fraccion2.denominador;
        int resnum = fraccion1.numerador * fraccion2.numerador;
        //simplificar(pendiente!!)
        Fraccion resultado = new Fraccion(resnum, resden);
        return resultado;

    }

    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2) {
        Fraccion fraccion1 = new Fraccion(f1.numerador, f1.denominador);
        Fraccion fraccion2 = new Fraccion(f2.numerador, f2.denominador);
        int resnum = fraccion1.numerador * fraccion2.denominador;
        int resden = fraccion1.denominador * fraccion2.numerador;
        //simplificar(pendiente!!)
        Fraccion resultado = new Fraccion(resnum, resden);
        return resultado;
    }

    public Fraccion simplificar(Fraccion f1, Fraccion f2) {
        //En construccion
         Fraccion fraccion1 = new Fraccion(f1.numerador, f1.denominador);
        Fraccion fraccion2 = new Fraccion(f2.numerador, f2.denominador);
        int resnum = 1;
        int resden = 1;
        Fraccion resultado = new Fraccion(resnum, resden);
        return resultado;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
