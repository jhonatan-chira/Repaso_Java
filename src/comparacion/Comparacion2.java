package comparacion;

import scanner.ScannerManager;

import java.util.Scanner;

public class Comparacion2 {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var a = ScannerManager.leerInt(scanner, "Ingresa un número: ");
        final var b = ScannerManager.leerInt(scanner, "Ingresa un número: ");

        scanner.close();

        imprimirResultado(a, b, sonIguales(a, b));
    }

    static boolean sonIguales(int a, int b) {
        return a == b;
    }

    static void imprimirResultado(int a, int b, boolean sonIguales) {
        System.out.printf("¿El número %d es igual a %d? %b",
                a, b, sonIguales);
    }
}
