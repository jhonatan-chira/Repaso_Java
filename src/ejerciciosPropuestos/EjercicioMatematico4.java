package ejerciciosPropuestos;

import java.util.Random;

public class EjercicioMatematico4 {
    public static void main(String[] args) {
        final var min = 20;
        final var max = 100;

        Random random = new Random();


        final var radio = random.nextInt(max - min + 1) + min;

        final var perimetroCirculo = 2 * Math.PI * radio;
        final var areaCirculo = Math.PI * Math.pow(radio, 2);

        System.out.printf("Para un radio de %d se tiene un perímetro de %.3f y " +
                "un área de %.3f", radio, perimetroCirculo, areaCirculo);
    }
}
