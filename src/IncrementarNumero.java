import java.util.Random;
import java.util.Scanner;

public class IncrementarNumero {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var random = new Random();

        var numeroInt = leerInt(scanner, "Ingresa un número: ");
        numeroInt++;
        System.out.printf("El número incrementado es: %d%n", numeroInt);

        var n = numeroAleatorio(3, 10, random);
        numeroInt += n;
        System.out.printf("Número aleatorio es: %d%n", n);

        System.out.printf("El número incrementado es: %d%n", numeroInt);
        scanner.close();
    }

    static int leerInt(Scanner scanner, String mensaje) {
        System.out.printf("%s", mensaje);
        return scanner.nextInt();
    }

    static int numeroAleatorio(int min, int max, Random random) {
        return random.nextInt(max - min + 1) + min;
    }
}