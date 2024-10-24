package ejerciciosPropuestos;

import java.util.Random;

public class LeyNewton {
    public static void main(String[] args) {
        final var random = new Random();
        final var masa = RandomUtilities.GenerarRandomDouble(100, 300, random);
        final var aceleracion = RandomUtilities.GenerarRandomDouble(3, 5, random);
        final var fuerza = calcularFuerza(masa, aceleracion);

        imprimirResultado(masa, aceleracion, fuerza);
    }

    static double calcularFuerza(double masa, double aceleracion) {
        return masa * aceleracion;
    }

    static void imprimirResultado(double masa, double aceleracion, double fuerza) {
        System.out.printf("Para una masa de %.4f y aceleracion %.4f " +
                "tenemos una fuerza de %.4f", masa, aceleracion, fuerza);
    }
}
