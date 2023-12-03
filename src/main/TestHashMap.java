package main;

import entities.AffectationHashMap;
import entities.Departement;
import entities.Employe;

public class TestHashMap {
	public static void main(String[] args) {
        AffectationHashMap affectationMap = new AffectationHashMap();

        Employe employe1 = new Employe(1, "ayari", "oussema", "RH", 3);
        Employe employe2 = new Employe(2, "mimouni", "aziz", "IT", 2);
        Employe employe3 = new Employe(3, "khrissi", "fedi", "RH", 1);

        Departement departementRH = new Departement(1, "RH", 10);
        Departement departementIT = new Departement(2, "IT", 15);

        affectationMap.ajouterEmployeDepartement(employe1, departementIT);
        affectationMap.ajouterEmployeDepartement(employe2, departementIT);
        affectationMap.ajouterEmployeDepartement(employe3, departementRH);

        System.out.println("Affectations actuelles :");
        affectationMap.afficherDepartements();

        // Test 2: Afficher la liste des employés
        System.out.println("\nListe des employés :");
        affectationMap.afficherEmployes();

        // Test 3: Afficher la liste des départements
        System.out.println("\nListe des départements :");
        affectationMap.afficherDepartements();

        // ... (autres tests restent inchangés)
    }}