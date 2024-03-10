package es.daw.model;

public class EmpleadoMalaPráctica {
    // ********************** MALA PRÁCTICA *************************
    public String nombre;
    public int edad;
    public String departamento;
    public double salario;

    public EmpleadoMalaPráctica(String nombre, int edad, String departamento, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: " + salario);
    }

    public void aumentarSalario(double porcentaje) {
        salario = salario * (1 + porcentaje / 100);
        System.out.println("Nuevo salario: " + salario);
    }

    public void cambiarDepartamento(String nuevoDepartamento) {
        departamento = nuevoDepartamento;
        System.out.println("Departamento cambiado a: " + departamento);
    }
}
