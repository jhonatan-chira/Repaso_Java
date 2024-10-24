package comparacion;

import ejerciciosPropuestos.RandomUtilities;

import java.util.Random;

public class Comparacion1 {

    public static void main(String[] args) {
        final var random = new Random();

        final var a = RandomUtilities.GenerarRandomInt(20, 100, random);
        final var b = RandomUtilities.GenerarRandomInt(20, 100, random);

        imprimirResultado(a, esNegativo(a));
        imprimirResultado(b, esNegativo(b));
    }

    static boolean esNegativo(int numero) {
        return numero < 0;
    }

    static void imprimirResultado(int numero, boolean negativo) {
        System.out.printf("¿El número %d es negativo?: %b%n",
                numero, negativo);
    }
}
