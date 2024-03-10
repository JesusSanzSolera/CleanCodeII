package es.daw;

public class MainBloque5 {
    public static void main(String[] args) throws Exception {
        // ****************** MALA PRÁCTICA *********************
        // int resultado = dividir(10, 0);
        // if (resultado == -1) {
        // System.out.println("Error al dividir entre 0");
        // } else {
        // System.out.println("El resultado es: " + resultado);
        // }
        // }

        // public static int dividir(int dividendo, int divisor) {
        // if (divisor == 0) {
        // return -1; // Código de retorno para indicar un error
        // }
        // return dividendo / divisor;
        // }

        // ******************** BUENA PRÁCTICA **********************
        try {
            int resultado = dividir(10, 0);
            System.out.println("El resultado es: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            // Código para asegurar un estado consistente, si es necesario
        }
    }

    public static int dividir(int dividendo, int divisor) throws IllegalArgumentException {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor no puede ser 0");
        }
        return dividendo / divisor;
    }

}
