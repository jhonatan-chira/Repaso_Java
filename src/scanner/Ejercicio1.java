package scanner;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var edad = ScannerManager.leerInt(scanner, "Ingresa tu edad: ");
        final var estatura = ScannerManager.leerDouble(scanner, "Ingresa tu estatura: ");

        scanner.nextLine();

        final var nombre = ScannerManager.leerString(scanner, "Ingrese su nombre: ");

        scanner.close();

        imprimirResultado(nombre, edad, estatura);
    }

    static void imprimirResultado(String nombre, int edad, double estatura) {
        System.out.printf("Mi nombre es %s , tengo %d y mido %.2fcm.",
                nombre, edad, estatura);
    }
}
