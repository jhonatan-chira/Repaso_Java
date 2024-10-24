package condicionalesBucles;

import ejerciciosPropuestos.RandomUtilities;

import java.util.Random;
import java.util.Scanner;

public class EjercicioCondicional7 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var numero = RandomUtilities.GenerarRandomInt(50, 300, new Random());
        scanner.close();
        System.out.println(validadAltoChance(numero));
    }

    static String validadAltoChance(int numero) {
        if (numero > 100 || numero % 5 == 0 || numero % 2 != 0) {
            return "Tienes un alto chance de ganar!";
        } else {
            return "Tienes un chance muy bajo de ganar";
        }
    }

    static void impirmirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
