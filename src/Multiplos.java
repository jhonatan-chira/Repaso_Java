import scanner.ScannerManager;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);

        final var numero = ScannerManager.leerInt(scanner, "Ingrese el número");

        scanner.close();

        imprimirResultado(numero, esPar(numero), esMultiplo5(numero));

    }

    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    static boolean esMultiplo5(int numero) {
        return numero % 5 == 0;
    }

    static void imprimirResultado(int numero, boolean esPar, boolean esMultiplo5) {
        System.out.printf("¿El número %d es par? %b%n" +
                        "¿El número %d es múltiplo de 5? %b%n",
                numero, esPar, numero, esMultiplo5);
    }
}
