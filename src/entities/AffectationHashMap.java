package entities;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AffectationHashMap {
	   private Map<Employe, Departement> affectations;

	    // Constructeur
	    public AffectationHashMap() {
	        this.affectations = new HashMap<>();
	    }
	    public void ajouterEmployeDepartement(Employe employe, Departement departement) {
	        // Vérifier si l'employé n'est pas déjà affecté à un département
	        if (!affectations.containsKey(employe)) {
	            affectations.put(employe, departement);
	            System.out.println("Affectation réussie : Employé " + employe.getIdentifiant() +
	                               " affecté au Département " + departement.getDepartmentName());
	        } else {
	            System.out.println("Cet employé est déjà affecté à un département.");
	        }
	    }
	    public void afficherEmployesEtDepartements() {
	        System.out.println("Liste des employés et de leurs départements :");
	        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
	            System.out.println("Employé " + entry.getKey().getIdentifiant() +
	                               " - Département " + entry.getValue().getDepartmentName());
	        }
	    }
	    public void supprimerEmploye(Employe employe) {
	        affectations.remove(employe);
	       
	    }
	    public void supprimerEmployeEtDepartement(Employe employe, Departement departement) {
	        Iterator<Map.Entry<Employe, Departement>> iterator = affectations.entrySet().iterator();
	        while (iterator.hasNext()) {
	            Map.Entry<Employe, Departement> entry = iterator.next();
	            if (entry.getKey().equals(employe) && entry.getValue().equals(departement)) {
	                iterator.remove();
	                
	                return;  // Sortir de la boucle dès que l'affectation est supprimée
	            }
	        }
	        System.out.println("Affectation non trouvée pour l'employé " + employe.getIdentifiant() +
	                           " dans le Département " + departement.getDepartmentName());
	    }
	    public void afficherEmployes() {
	        Set<Employe> employes = new HashSet<>(affectations.keySet());

	        if (employes.isEmpty()) {
	            System.out.println("Aucun employé dans la collection.");
	        } else {
	            System.out.println("Liste des employés :");
	            for (Employe employe : employes) {
	                System.out.println("Employé " + employe.getIdentifiant());
	            }
	        }
	    }
	    public void afficherDepartements() {
	        Set<Departement> departements = new HashSet<>(affectations.values());

	        if (departements.isEmpty()) {
	            System.out.println("Aucun département dans la collection.");
	        } else {
	            System.out.println("Liste des départements :");
	            for (Departement departement : departements) {
	                System.out.println("Département " + departement.getDepartmentName());
	            }
	        }
	    }
	    public boolean rechercherEmploye(Employe employe) {
	        return affectations.containsKey(employe);
	    }
	    public boolean rechercherDepartement(Departement departement) {
	        return affectations.containsValue(departement);
	    }
	    public TreeMap<Employe, Departement> trierMap() {
	        return new TreeMap<>(affectations);
	    }
}
