package models;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    public String nameSubject;
    public String idSubject;
    private String numberAssignedCredits;

    private List<Estudiante> assignedStudentToStudent = new ArrayList<>();

    public Asignatura(String nameSubject, String idSubject, String numberAssignedCredits) {
        this.nameSubject = nameSubject;
        this.idSubject = idSubject;
        this.numberAssignedCredits = numberAssignedCredits;
    }

    public void addStudentToSubject(Estudiante estudiante) {
        assignedStudentToStudent.add(estudiante);
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    public String getNumberAssignedCredits() {
        return numberAssignedCredits;
    }

    public void setNumberAssignedCredits(String numberAssignedCredits) {
        this.numberAssignedCredits = numberAssignedCredits;
    }

    @Override
    public String toString() {
        return "Nombre de la asignatura: " + nameSubject +
                ", Codigo de la asignatura: " + idSubject +
                ", Numero de creditos: " + numberAssignedCredits;
    }
}
