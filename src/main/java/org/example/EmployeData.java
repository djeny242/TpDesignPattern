package org.example;

import java.util.List;

public interface EmployeData {
    // methode pour ecrire une liste d'employer dans un fichier
    void ecrireEmploye(List<Employe> employes);

    //methode pour recuperer une liste d'employé dans un fichier
    List<Employe> lireEmploye();

}

