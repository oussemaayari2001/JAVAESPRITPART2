package main;

import entities.Employe;
import entities.SocieteArrayList;

public class TestSocieteArrayList {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe employe1 = new Employe(1, "Doe", "John", "Ressources Humaines", 2);
        Employe employe2 = new Employe(2, "Smith", "Jane", "Informatique", 3);

        societe.ajouterEmploye(employe1);
        societe.ajouterEmploye(employe2);

        System.out.println("Recherche par nom : " + societe.rechercherEmploye("Doe"));

        System.out.println("Affichage de tous les employés : ");
        societe.displayEmploye();

        System.out.println("Suppression de l'employé 1");
        societe.supprimerEmploye(employe1);

        System.out.println("Affichage après suppression : ");
        societe.displayEmploye();

        System.out.println("Tri par ID : ");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("Tri par Nom, Département et Grade : ");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
    }
}
