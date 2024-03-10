package es.daw.model;

public class GestionEmpleado {
    private InformacionEmpleado informacion;

    public GestionEmpleado(InformacionEmpleado informacion) {
        this.informacion = informacion;
    }

    public void aumentarSalario(double porcentaje) {
        informacion.aumentarSalario(porcentaje);
    }

    public void cambiarDepartamento(String nuevoDepartamento) {
        informacion.cambiarDepartamento(nuevoDepartamento);
    }
}
