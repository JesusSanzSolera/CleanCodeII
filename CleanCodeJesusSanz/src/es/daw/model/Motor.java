package es.daw.model;

public class Motor {
    private int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }
    
    public boolean esSuficientementePotente() {
        return potencia > 100;
    }
}