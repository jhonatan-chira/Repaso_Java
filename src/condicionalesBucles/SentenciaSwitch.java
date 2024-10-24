package condicionalesBucles;

import scanner.ScannerManager;

import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final var numero1 = ScannerManager.leerInt(scanner, "Ingrese el primer número");
        final var numero2 = ScannerManager.leerInt(scanner, "Ingrese el segundo número");
        imprimirMenu();
        final var opcion = ScannerManager.leerChar(scanner, "Elige una opción");
        scanner.close();
        ejecutarOpcion(opcion, numero1, numero2);

    }

    static void imprimirMenu() {
        System.out.printf("°Opción A/a: Sumar%n");
        System.out.printf("°Opción B/b: Restar%n");
        System.out.printf("°Opción C/c: Multiplicar%n");
        System.out.printf("°Opción D/d: Dividir%n");
        System.out.printf("°Opción E/e: Resto%n");
    }

    static int calcularSuma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    static int calcularResta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    static int calcularMultiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    static int calcularDivision(int numero1, int numero2) {
        return numero1 / numero2;
    }

    static int calcularResto(int numero1, int numero2) {
        return numero1 % numero2;
    }

    static void ejecutarOpcion(char opcion, int numero1, int numero2) {
        final var resultado = switch (opcion) {
            case 'A', 'a' -> calcularSuma(numero1, numero2);
            case 'B', 'b' -> calcularResta(numero1, numero2);
            case 'C', 'c' -> calcularMultiplicacion(numero1, numero2);
            case 'D', 'd' -> calcularDivision(numero1, numero2);
            case 'E', 'e' -> calcularResto(numero1, numero2);
            default -> -1;
        };

        if (resultado != -1) {
            System.out.printf("El resultado entre los números %d & %d es %d%n", numero1, numero2, resultado);
        } else {
            System.out.printf("Opción incorrecta");
        }
    }


}
