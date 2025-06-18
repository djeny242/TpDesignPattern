package org.example;


import java.util.ArrayList;
import java.util.List;

// création de la classe Employe
public class Employe {
    private String nom;
    private String email;
    private boolean estAdmin=false;
    private List<Notification> notifications;
// le constructeur
    public Employe(String nom, String email, boolean estAdmin) {
        this.nom = nom;
        this.email= email;
        this.estAdmin = estAdmin;
        this.notifications = new ArrayList<>();

    }
// Getters

    public String getNom() {
        return nom;
    }



    public String getEmail() {
        return email;
    }

    public boolean isEstAdmin() {
        return estAdmin;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }
}


