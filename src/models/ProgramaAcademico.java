package models;

import java.util.ArrayList;
import java.util.List;

public class ProgramaAcademico {

    private String nombrePrograma;
    private List<Estudiante> estudiantesMatriculados = new ArrayList<>();

    public ProgramaAcademico(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public List<Estudiante> getEstudiantesMatriculados() {
        return estudiantesMatriculados;
    }

    public void matricularEstudiante(Estudiante estudiante) {
        estudiantesMatriculados.add(estudiante);
    }

    public void agregarEstudianteMatriculado(Estudiante estudiante) {
        estudiantesMatriculados.add(estudiante);
    }

    @Override
    public String toString() {
        return "Programa Académico: " + nombrePrograma
                + ", Estudiantes Matriculados: " + estudiantesMatriculados.size();
    }
}