import ejerciciosPropuestos.RandomUtilities;
import scanner.ScannerManager;

import java.util.Random;
import java.util.Scanner;

public class DecrementarNumero {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var random = new Random();

        var numero = ScannerManager.leerInt(scanner, "Ingrese un número: ");
        numero--;
        System.out.printf("Número decrementado en 1: %d%n", numero);

        final var n = RandomUtilities.GenerarRandomInt(3, 10, random);
        numero -= n;
        System.out.printf("Número aleatorio: %d%n", n);
        System.out.printf("Número decrementado en n: %d%n", numero);

        scanner.close();
    }
}
