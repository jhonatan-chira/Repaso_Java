package condicionalesBucles;

import scanner.ScannerManager;

import java.util.Scanner;

public class EjercicioCondicional6 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        mostrarMenu();
        final var generoJuego = ScannerManager.leerString(scanner, "Ingrese un género de juego");
        scanner.close();
        mostrarListaJuegos(GeneroJuego.valueOf(generoJuego));
    }

    static void mostrarMenu() {
        System.out.println("ACCION");
        System.out.println("LUCHAS");
        System.out.println("RPG");
    }

    enum GeneroJuego {
        ACCION,
        LUCHAS,
        RPG
    }

    static void mostrarListaJuegos(GeneroJuego generoJuego) {
        switch (generoJuego) {
            case ACCION -> System.out.print("°GOD OF WAR \n°BATMAN ARKHAM \n°SPIDERMAN");
            case LUCHAS -> System.out.println("°TEKKEN \n°STREET FIGHTER \n°SMASH BROTHERS");
            case RPG -> System.out.println("°MARIO RPG \n°PAPER MARIO \n°MONSTER SANCTUARY");
        }
        ;
    }
}
