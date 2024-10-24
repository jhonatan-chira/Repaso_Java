package condicionalesBucles;

import scanner.ScannerManager;

import java.util.Scanner;

public class EjercicioCondicional1 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var edad = ScannerManager.leerInt(scanner, "Ingresa tu edad");
        scanner.close();

        final var mensaje = validarDescuento(edad);

        imprimirMensaje(mensaje);
    }

    static String validarDescuento(int edad) {
        return (edad > 20 && edad < 50) ? "Cumples con la condición para el descuento" : "No cumples la condición debido a tu edad";
    }

    static void imprimirMensaje(String mensaje) {
        System.out.printf(mensaje);
    }
}
