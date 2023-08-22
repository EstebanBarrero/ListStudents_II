package models;

import java.util.ArrayList;
import java.util.List;

public class ProgramaAcademico {

    private String nombrePrograma;
    private List<Estudiante> estudiantesMatriculados = new ArrayList<>();
    private List<Asignatura> registerSubjects = new ArrayList<>();


    public ProgramaAcademico(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public List<Estudiante> getEstudiantesMatriculados() {
        return estudiantesMatriculados;
    }

    public List<Asignatura> getRegisterSubject(){
        return registerSubjects;
    }

    public void matricularEstudiante(Estudiante estudiante) {
        estudiantesMatriculados.add(estudiante);
    }

    public void agregarEstudianteMatriculado(Estudiante estudiante) {
        estudiantesMatriculados.add(estudiante);
    }

    public void addSubjectToProgram(Asignatura subject) {
        registerSubjects.add(subject);
    }

    @Override
    public String toString() {
        return "Programa Académico: " + nombrePrograma
                + ", Estudiantes Matriculados: " + estudiantesMatriculados.size()
                + ", Asignaturas Registradas: " + registerSubjects.size();
    }
}