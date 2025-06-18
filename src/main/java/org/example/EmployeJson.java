package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;

/* cette classe implemente l'interface EmployerData
* qui permet de redéfinir les methodes lire et ecrire
* dans fichier json
*
* */
public class EmployeJson implements EmployeData {
    // Constante qui contient le chemin d'accès vers le fichier Json

    private final String chemin = "/src/main/java/org/example/employes.json";

    // Objet Gson qui permet de serialiser/deserialiser du Json
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public void ecrireEmploye(List<Employe> employes) {
        try {
            FileWriter w = new FileWriter("/src/main/java/org/example/employes.json");
            gson.toJson(employes, w);
            w.close();
        } catch (IOException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }

    @Override
    public List<Employe> lireEmploye() {
        try {
            Reader r = new FileReader("/src/main/java/org/example/employes.json");
            Type type = new TypeToken<List<Employe>>() {
            }.getType();
            List<Employe> employes = gson.fromJson(r, type);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

