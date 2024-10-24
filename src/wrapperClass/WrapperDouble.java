package wrapperClass;

public class WrapperDouble {

    public static void main(String[] args) {

        final var precio1 = "45.50";
        final var precio2 = "32.20";
        final var precio3 = "75.12";

        final var total = calcularSuma(precio1, precio2, precio3);
        imprimirSuma(total);
    }

    static double calcularSuma(String precio1, String precio2, String precio3) {
        final var p1 = Double.parseDouble(precio1);
        final var p2 = Double.parseDouble(precio2);
        final var p3 = Double.parseDouble(precio3);

        return p1 + p2 + p3;
    }

    static void imprimirSuma(double precioTotal) {
        System.out.printf("El precio total es %.2f", precioTotal);
    }

}
