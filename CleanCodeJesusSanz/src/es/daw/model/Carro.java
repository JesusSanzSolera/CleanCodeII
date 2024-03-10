package es.daw.model;

public class Carro {
    private Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    // Método que viola la Ley de Demeter
    public void acelerar(int cantidad) {
        // Aquí se está accediendo directamente a la potencia del motor
        if (motor.getPotencia() > 100) {
            System.out.println("Acelerando...");
        } else {
            System.out.println("Motor no lo suficientemente potente");
        }
    }

    // Método sin violar la Ley de Demeter
    public void acelerar() {
        if (motor.esSuficientementePotente()) {
            System.out.println("Acelerando...");
        } else {
            System.out.println("Motor no lo suficientemente potente");
        }
    }
}