package MasEjercicios;

import ejerciciosPropuestos.RandomUtilities;

import java.util.Random;

public class EjercicioRandom {
    public static void main(String[] args) {
        final var random = new Random();
        final var entero = RandomUtilities.GenerarRandomInt(5, 10, random);
        final var decimales = RandomUtilities.GenerarRandomDouble(5, 10, random);

        System.out.printf("Enteros random: %d%n" +
                "Doubles random: %.3f", entero, decimales);

    }
}
