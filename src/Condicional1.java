import scanner.ScannerManager;

import java.util.Random;
import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final var numeroJugador = ScannerManager.leerInt(scanner, "Ingrese un número entre 1 y 6");
        scanner.close();

        final var numeroAleatorio = RandomUtilities.generarRandomInt(6, 1, new Random());

        if (validarNumero(numeroJugador)) {
            mostrarMensajeGanador(numeroJugador, numeroAleatorio);
        } else {
            System.out.printf("Número no válido, intente de nuevo");
            ;
        }

    }

    static boolean validarNumero(int numeroJugador) {
        return (numeroJugador >= 1) && (numeroJugador <= 6);
    }

    static void mostrarMensajeGanador(int numeroJugador, int numeroAleatorio) {
        System.out.printf("Número aleatorio: %d%n", numeroAleatorio);

        if (numeroJugador == numeroAleatorio) {
            System.out.printf("Ganaste!!");
        } else {
            System.out.printf("Perdiste!!");
        }
    }
}
