package condicionalesBucles;

import scanner.ScannerManager;

import java.util.Scanner;

public class EjercicioCondicional4 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var numero = ScannerManager.leerInt(scanner, "Ingresar un número");
        mostrarMenumenu();
        final var opcion = ScannerManager.leerChar(scanner, "Ingresar una opción");
        imprimirMensaje(numero, verificarCondicion(opcion, numero));
    }

    static void mostrarMenumenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("A : Verificar si el número es par y mayor que 50");
        System.out.println("B : Verificar si el número es múltiplo de 5 y es menor que 30");
        System.out.println("C : Verificar si el número termina en 0 y es mayor que 500");
    }

    static int verificarCondicion(char opcion, int numero) {
        final var verificar = switch (Character.toLowerCase(opcion)) {
            case 'a' -> (numero % 2 == 0 && numero > 50) ? 1 : 0;
            case 'b' -> (numero % 5 == 0 && numero < 30) ? 1 : 0;
            case 'c' -> (numero % 10 == 0 && numero > 500) ? 1 : 0;
            default -> -1;
        };

        return verificar;
    }

    static void imprimirMensaje(int numero, int cumpleCondicion) {
        if (cumpleCondicion == 1) {
            System.out.printf("El número %d cumple la condición", numero);
        } else if (cumpleCondicion == 0) {
            System.out.printf("El número %d no cumple con la condición", numero);
        } else {
            System.out.printf("Opción no válida");
        }
    }


}
