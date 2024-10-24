package ejerciciosPropuestos;

import java.util.Random;

public class MediaGeometrica {
    public static void main(String[] args) {
        final var min = 15;
        final var max = 25;
        final var random = new Random();

        final var x1 = (max - min) * random.nextDouble() + min;
        final var x2 = (max - min) * random.nextDouble() + min;
        final var x3 = (max - min) * random.nextDouble() + min;
        final var x4 = (max - min) * random.nextDouble() + min;

        final var productoX = x1 * x2 * x3 * x4;

        final var mediaGeometrica = Math.pow(productoX, 0.25);

        System.out.printf("La media geométrica de %.3f, %.3f, %.3f y %.3f es %.5f",
                x1, x2, x3, x4, mediaGeometrica);

    }
}
