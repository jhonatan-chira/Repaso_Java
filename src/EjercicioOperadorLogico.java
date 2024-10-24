import scanner.ScannerManager;

import java.util.Scanner;

public class EjercicioOperadorLogico {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var edad = ScannerManager.leerInt(scanner, "Ingresa tu edad");
        final var ingresos = ScannerManager.leerInt(scanner, "Ingresa tus ingresos");

        scanner.close();

        final var validar = validadJubilacion(edad, ingresos);

        imprimirMensaje(edad, ingresos, validar);

    }

    static boolean validadJubilacion(int edad, int ingresos) {
        return (edad >= 65) && (ingresos < 2000);
    }

    static void imprimirMensaje(int edad, int ingresos, boolean cumpleCondicion) {
        System.out.printf("Tu edad es de %d%n", edad);
        System.out.printf("Tus ingresos son %d%n", ingresos);
        System.out.printf("¿Puedes jubilarte? %b%n", cumpleCondicion);

    }
}
