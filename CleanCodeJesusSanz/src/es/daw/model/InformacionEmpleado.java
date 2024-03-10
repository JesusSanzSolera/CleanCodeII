package es.daw.model;

public class InformacionEmpleado {
    // ****************** BUENA PRÁCTICA **********************
    private String nombre;
    private int edad;
    private String departamento;
    private double salario;

    public InformacionEmpleado(String nombre, int edad, String departamento, double salario) {
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
        salario = salario + (salario * porcentaje);
    }

    public void cambiarDepartamento(String nuevoDepartamento) {
        departamento = nuevoDepartamento;
    } 
}
