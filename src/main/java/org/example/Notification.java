package org.example;

import java.time.LocalDate;


public class
Notification {
    private String message;
    private String expediteur;
    private LocalDate date;

//constructeur
    public Notification(String message, String expediteur, LocalDate date) {
        this.message = message;
        this.expediteur = expediteur;
        this.date = date;
    }
// Getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(String expediteur) {
        this.expediteur = expediteur;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
