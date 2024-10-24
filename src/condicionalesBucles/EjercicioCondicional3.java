package condicionalesBucles;

import scanner.ScannerManager;

import java.util.Scanner;

public class EjercicioCondicional3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var edad = ScannerManager.leerInt(scanner, "Ingresa tu edad");
        final var ingresos = ScannerManager.leerInt(scanner, "Ingresa tus ingresos");
        scanner.close();

        final var mensaje = verificarJubilacion(edad, ingresos);
        imprimirMensaje(mensaje);
    }

    static String verificarJubilacion(int edad, int ingresos) {
        return (edad > 65 && ingresos < 2000) ? "Aprobaste, felicidades!" : "Desaprobaste, sigue intentando";
    }


    static void imprimirMensaje(String mensaje) {
        System.out.printf(mensaje);
    }
}
