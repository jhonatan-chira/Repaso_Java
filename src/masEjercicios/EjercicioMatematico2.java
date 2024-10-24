package masEjercicios;

import java.util.Random;

public class EjercicioMatematico2 {
    public static void main(String[] args) {
        final var max = 100;
        final var min = 20;
        final var random = new Random();
        var radio = random.nextInt(max - min + 1) + min;

        final var area = Math.PI * Math.pow(radio, 2);
        final var perimetro = 2 * Math.PI * radio;

        System.out.printf("Valor de un radio %d se tiene un perímetro de %.3f%n "
                + "y un área de  %.3f", radio, perimetro, area);
    }
}
