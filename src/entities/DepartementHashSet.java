package entities;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import interfaces.IDepartement;

public class DepartementHashSet implements IDepartement<Departement> {
    private Set<Departement> departementSet;

    // Constructeur
    public DepartementHashSet() {
        this.departementSet = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement t) {
        departementSet.add(t);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement department : departementSet) {
            if (department.getDepartmentName().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement t) {
        return departementSet.contains(t);
    }

    @Override
    public void supprimerDepartement(Departement t) {
        departementSet.remove(t);
    }


	@Override
	public void displayDepartement() {
        for (Departement department : departementSet) {
            System.out.println(department);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedSet = new TreeSet<>(departementSet);
        return sortedSet;
    }




   
}