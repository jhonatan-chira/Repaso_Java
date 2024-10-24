import java.util.Random;

public class ProbarRandomMetodos {
    public static void main(String[] args) {
        final var random = new Random();
        final var randomInt = RandomUtilities.generarRandomInt(100, 20, random);
        final var randomDouble = RandomUtilities.generarRandomDouble(500.20, 100.20, random);

        System.out.printf("Los números aleatorios entero es %d y double es %.2f%n"
                , randomInt, randomDouble);
    }
}
