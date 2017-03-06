package Calculadora;

/**
 * Created by Roberto on 01/03/2017.
 */
public class Division implements Operacion {

    double a,b;

    public Division(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate() throws InfiniteException {
        if (b==0){
            throw new InfiniteException("Math error");
        }
        return (a/b);
    }
}
