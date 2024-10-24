package masEjercicios;

import java.util.Random;

public class EjerciciosMetodos1 {
    public static void main(String[] args) {
        final var random = new Random();
        final var aceleracion = random.nextDouble(3.5, 5.0);
        final var masa = random.nextDouble(100.0, 300.0);
    }

    static double calcularFuerza(double masa, double aceleracion) {
        return masa * aceleracion;
    }

    static void imprimirResultado(double fuerza, double masa, double aceleracion) {
        System.out.printf("Para una masa de %.4f y aceleración %.4f tenemos una fuerza %.4f", fuerza, masa, aceleracion);
    }
}
