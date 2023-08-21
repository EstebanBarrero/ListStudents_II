package models;

public class Estudiante {
    public String nombresApellidos;
    public String codigoEstudiante;
    public String correoElectronico;

    public Estudiante(String nombresApellidos, String codigoEstudiante, String correoElectronico) {
        this.nombresApellidos = nombresApellidos;
        this.codigoEstudiante = codigoEstudiante;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Nombres y Apellidos: " + nombresApellidos +
                ", Código de Estudiante: " + codigoEstudiante +
                ", Correo Electrónico: " + correoElectronico;
    }
}
