package entities;

import java.util.Objects;

public class Departement implements Comparable<Departement> {
    private int id;
    private String departmentName;
    private int numberOfEmployees;

    // Constructeur sans paramètre
    public Departement() {
    }

    // Constructeur avec paramètres
    public Departement(int id, String departmentName, int numberOfEmployees) {
        this.id = id;
        this.departmentName = departmentName;
        this.numberOfEmployees = numberOfEmployees;
    }

    // Redéfinition de la méthode equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(departmentName, that.departmentName);
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                '}';
    }

    // Getter pour l'ID du département
    public int getId() {
        return id;
    }

    // Getter pour le nom du département
    public String getDepartmentName() {
        return departmentName;
    }

	@Override
	public int compareTo(Departement o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
}