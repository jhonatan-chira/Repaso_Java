package comparacion;

import scanner.ScannerManager;

import java.util.Scanner;

public class Comparacion4 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var radio = ScannerManager.leerDouble(scanner, "Ingrese el radio");
        imprimirMenu();
        final var opcion = ScannerManager.leerChar(scanner, "Elige una opción");
        scanner.close();

        if (validarInput(opcion)) {
            if (opcion == 'A') {
                mostrarArea(calcularArea(radio));
            } else if (opcion == 'B') {
                mostrarPerimetro(calcularPerimetro(radio));
            } else if (opcion == 'C') {
                mostrarArea(calcularArea(radio));
                mostrarPerimetro(calcularPerimetro(radio));
            }
        } else {
            System.out.printf("Opción incorrecta");
        }

    }

    static void imprimirMenu() {
        System.out.printf("A: Calcular el área %n");
        System.out.printf("B: Calcular el pérímetro %n");
        System.out.printf("C: Calcular ambos %n");
    }

    static boolean validarInput(char opcion) {
        return (opcion == 'A') || (opcion == 'B') || (opcion == 'C');
    }

    static double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }

    static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    static void mostrarArea(double area) {
        System.out.printf("El área del círculo es %.2f%n", area);
    }

    static void mostrarPerimetro(double perimetro) {
        System.out.printf("El perímetro del círculo es %.2f%n", perimetro);
    }


}
