package masEjercicios;

import ejerciciosPropuestos.RandomUtilities;

import java.util.Random;

public class MruvFisica {

    public static void main(String[] args) {
        final var random = new Random();

        final var velocInicial = RandomUtilities.GenerarRandomDouble(10, 30, random);
        final var aceleracion = RandomUtilities.GenerarRandomDouble(2, 5, random);
        final var tiempo = RandomUtilities.GenerarRandomInt(3, 5, random);

        final var velocFinal = calcularVelocidadFinal(velocInicial, aceleracion, tiempo);

        imprimirResultado(velocFinal, velocInicial, aceleracion, tiempo);
    }

    static double calcularVelocidadFinal(double velocidadInicial, double aceleraion, int tiempo) {
        return velocidadInicial + aceleraion * tiempo;
    }

    static void imprimirResultado(double velocidadFinal, double velocidadInicial, double aceleracion, int tiempo) {
        System.out.printf("Para una velocidad inicial %.3f, una aceleración %.3f y un tiempo %d " +
                        "Se tiene una velocidad final %.3f usando MRUV",
                velocidadInicial, aceleracion, tiempo, velocidadFinal);
    }
}
