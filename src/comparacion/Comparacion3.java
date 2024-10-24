package comparacion;

import scanner.ScannerManager;

import java.util.Scanner;

public class Comparacion3 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var montoInicial = ScannerManager.leerDouble(scanner, "Ingrese el monto a prestar");
        scanner.close();


        imprimirResultado(calcularMonto(montoInicial), montoInicial);
    }

    static double calcularMonto(double montoInicial) {
        final var aumento1 = (montoInicial % 2 == 0) ? montoInicial * 0.1 : 0;
        final var aumento2 = (montoInicial % 3 == 0) ? 500 : 0;
        final var aumento3 = (montoInicial > 500) ? 300 : 0;

        return montoInicial + aumento1 + aumento2 + aumento3;
    }

    static void imprimirResultado(double montoFinal, double montoInicial) {
        System.out.printf("Para el préstammo %.2f se le cobrará %.2f al final", montoInicial, montoFinal);
    }
}
