package main;

import java.util.TreeSet;

import entities.Departement;
import entities.DepartementHashSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartementHashSet departementSet = new DepartementHashSet();

        // Create some Departement objects
        Departement department1 = new Departement(1, "HR", 20);
        Departement department2 = new Departement(2, "IT", 30);
        Departement department3 = new Departement(3, "Finance", 25);

        // Add Departement objects to the set
        departementSet.ajouterDepartement(department1);
        departementSet.ajouterDepartement(department2);
        departementSet.ajouterDepartement(department3);

        // Display all Departements
        System.out.println("All Departements:");
        departementSet.displayDepartement();

        // Search for a Departement by name
        String departmentNameToSearch = "IT";
        boolean isDepartmentFound = departementSet.rechercherDepartement(departmentNameToSearch);
        System.out.println("Is " + departmentNameToSearch + " found? " + isDepartmentFound);

        // Remove a Departement
        departementSet.supprimerDepartement(department2);

        // Display all Departements after removal
        System.out.println("\nDepartements after removal:");
        departementSet.displayDepartement();

        // Sort Departements by ID
        TreeSet<Departement> sortedDepartements = departementSet.trierDepartementById();

        // Display sorted Departements
        System.out.println("\nSorted Departements by ID:");
        for (Departement department : sortedDepartements) {
            System.out.println(department);
        }
	}

}
