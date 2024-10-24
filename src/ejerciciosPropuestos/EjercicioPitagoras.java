package ejerciciosPropuestos;

import java.util.Random;

public class EjercicioPitagoras {
    public static void main(String[] args) {
        final var min = 5;
        final var max = 100;

        Random random = new Random();

        final var cateto1 = (max - min) * random.nextDouble() + min;
        final var cateto2 = (max - min) * random.nextDouble() + min;

        final var cateto1Potencia = Math.pow(cateto1, 2);
        final var cateto2Potencia = Math.pow(cateto2, 2);

        var sumaCatetos = cateto1Potencia + cateto2Potencia;

        var hipotenusa = Math.sqrt(sumaCatetos);

        System.out.printf("Para los catetos %.2f y %.2f tenemos una hipotenusa de %.2f",
                cateto1, cateto2, hipotenusa);
    }
}
