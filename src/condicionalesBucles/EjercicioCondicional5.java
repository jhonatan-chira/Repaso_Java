package condicionalesBucles;

import scanner.ScannerManager;

import java.util.Scanner;

public class EjercicioCondicional5 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var lado = ScannerManager.leerDouble(scanner, "Ingrese el lado del triángulo equilátero");
        mostrarMenu();
        final char opcion = ScannerManager.leerChar(scanner, "Elija una opción");
        scanner.close();
        calcularResultado(opcion, lado);

        if (opcionMinuscula(opcion) == 'a') {
            imprimirMensaje(calcularResultado(opcion, lado));
        } else if (opcionMinuscula(opcion) == 'b') {
            imprimirMensaje(calcularResultado(opcion, lado));
        } else {
            System.out.println("Opción no válida");
        }

    }

    static void mostrarMenu() {
        System.out.println("Triángulo equilátero");
        System.out.println("¿Qué desea hacer?");
        System.out.println("A: Calcular el área del triángulo");
        System.out.println("B: Calcular el perímetro del triángulo");
    }

    static double calcularResultado(char opcion, double lado) {
        final var calculo = switch (opcionMinuscula(opcion)) {
            case 'a' -> calcularArea(lado);
            case 'b' -> calcularPerimetro(lado);
            default -> -1.0;
        };

        return calculo;

    }

    static double calcularArea(double lado) {
        return Math.sqrt(3) * Math.pow(lado, 2) / 4;
    }

    static double calcularPerimetro(double lado) {
        return lado * 3;
    }

    static void imprimirMensaje(double resultado) {
        System.out.printf("El resultado es %f", resultado);
    }

    static char opcionMinuscula(char opcion) {
        return Character.toLowerCase(opcion);
    }
}
