package wrapperClass;

public class WrapperInteger {

    public static void main(String[] args) {
        final var cantidad1 = "23";
        final var cantidad2 = "5";
        final var cantidad3 = "111";

        final var sumaTotal = calcularSuma(cantidad1, cantidad2, cantidad3);

        imprimirsuma(sumaTotal);
    }

    static int calcularSuma(String cantidad1, String cantidad2, String cantidad3) {
        final var cantidad1Integer = Integer.parseInt(cantidad1);
        final var cantidad2Integer = Integer.parseInt(cantidad2);
        final var cantidad3Integer = Integer.parseInt(cantidad3);

        return cantidad1Integer + cantidad2Integer + cantidad3Integer;
    }

    static void imprimirsuma(int precioTotal) {
        System.out.printf("La cantidad total es %d%n", precioTotal);
    }

}
