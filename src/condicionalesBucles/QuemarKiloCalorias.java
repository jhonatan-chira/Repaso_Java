package condicionalesBucles;

import scanner.ScannerManager;

import java.util.Scanner;

public class QuemarKiloCalorias {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var diaSemana = ScannerManager.leerString(scanner, "Ingrese en mayúscula un día de la semana");
        scanner.close();

        final var dia = DiaSemana.valueOf(diaSemana);

        imprimirResultado(diaSemana, calcularKCal(dia));

    }

    static int calcularKCal(DiaSemana diaSemana) {
        return switch (diaSemana) {
            case LUNES -> 350;
            case MARTES -> 420;
            case MIERCOLES -> 220;
            case JUEVES -> 600;
            case VIERNES -> 125;
            case SABADO -> 250;
            case DOMINGO -> 1000;
        };

    }

    static void imprimirResultado(String diaSemana, int cantidadKCal) {
        if (cantidadKCal != -1) {
            System.out.printf("Para el día %s se tiene que quemar %dKcal",
                    diaSemana, cantidadKCal);
        } else {
            System.out.printf("Día de la semana incorrecto. Ingrese un día válido");
        }
    }

    enum DiaSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }
}
