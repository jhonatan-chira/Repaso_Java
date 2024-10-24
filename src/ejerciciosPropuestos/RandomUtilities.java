package ejerciciosPropuestos;

import java.util.Random;

public class RandomUtilities {

    public static int GenerarRandomInt(int min, int max, Random random) {
        return random.nextInt(max - min + 1) + min;
    }

    public static double GenerarRandomDouble(int min, int max, Random random) {
        return (max - min) * random.nextDouble() + min;
    }
}
