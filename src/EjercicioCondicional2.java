import java.util.Random;

public class EjercicioCondicional2 {
    public static void main(String[] args) {
        final var numero = RandomUtilities.generarRandomInt(300, 50, new Random());
        System.out.printf("El número aleatorio es: %d%n", numero);
        final var mensaje = chanceGanar(numero);
        imprimirMensaje(mensaje);

    }

    static String chanceGanar(int numero) {
        return (numero > 100 || numero % 5 == 0 || numero % 2 != 0) ?
                "Tienes un alto chance de ganar!" : "Tienes un chance muy bajo de ganar";
    }

    static void imprimirMensaje(String mensaje) {
        System.out.printf(mensaje);
    }
}
