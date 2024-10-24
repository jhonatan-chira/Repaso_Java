package masEjercicios;

public class EjercicioMatematico1 {
    public static void main(String[] args) {
        final var velocidadInicial = 15.24;
        final var aceleracion = 3.75;
        final var tiempo = 5;

        final var velocidadFinal = velocidadInicial + aceleracion * tiempo;

        System.out.printf("Para una velocidad inicial %3f , una aceleración %3f " +
                "y un tiempo %d. Se tiene una velocidad final %.3f usando MRUV", velocidadInicial, aceleracion, tiempo, velocidadFinal);
    }
}
