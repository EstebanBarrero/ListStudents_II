package models;

public class Asignatura {
    public String nameSubject;
    public String idSubject;
    private String numberAssignedCredits;

    public Asignatura(String nameSubject, String idSubject) {
        this.nameSubject = nameSubject;
        this.idSubject = idSubject;
    }

    @Override
    public String toString() {
        return "Nombre de la asignatura: " + nameSubject +
                ", Codigo de la asignatura: " + idSubject;
    }
}
