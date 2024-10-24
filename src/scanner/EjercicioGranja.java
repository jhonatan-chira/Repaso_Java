package scanner;

import java.util.Scanner;

public class EjercicioGranja {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.printf("Ingresa el número de gallinas: ");
        final var gallinas = scanner.nextInt();

        System.out.printf("Ingrese el número de vacas: ");
        final var vacas = scanner.nextInt();

        final var cantidadCabezas = calcularCantidadCabezas(gallinas, vacas);
        final var cantidadPatas = calcularCantidadPatas(gallinas, vacas);

        imprimirMensaje(gallinas, vacas, cantidadCabezas, cantidadPatas);

        scanner.close();
    }

    static int calcularCantidadCabezas(int numeroGallinas, int numeroVacas) {
        return numeroGallinas + numeroVacas;
    }

    static int calcularCantidadPatas(int numeroGallinas, int numeroVacas) {
        return 2 * numeroGallinas + 4 * numeroVacas;
    }

    static void imprimirMensaje(int numeroGallinas, int numeroVacas, int numeroCabezas, int numeroPatas) {
        System.out.printf("• En %d vacas & %d gallinas hay %d cabezas\n" +
                        "• En %d vacas & %d gallinas hay %d patas ",
                numeroVacas, numeroGallinas, numeroCabezas, numeroVacas, numeroGallinas, numeroPatas);
    }

}
