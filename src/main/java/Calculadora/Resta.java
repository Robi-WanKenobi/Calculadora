package Calculadora;

/**
 * Created by Roberto on 01/03/2017.
 */
public class Resta implements Operacion {

    double a,b;

    public Resta(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate() {
        return a-b;    }
}
