package ca.uqam.mgl7460.tp1.implementations.modeles;

import ca.uqam.mgl7460.tp1.types.modeles.Propriete;
import ca.uqam.mgl7460.tp1.types.modeles.Adresse;
/**
 * Cette classe représente les propriétés 
  */
public class ProprieteImpl implements Propriete {

    /** Adresse de la propriété */
    private Adresse adresse;

    /** Valeur marchande de la propriété */
    private float valeurDeMarche;

    public ProprieteImpl(Adresse adresse, float valeurDeMarche) {
        this.adresse = adresse;
        this.valeurDeMarche = valeurDeMarche;
    }

    /**
     * Retourne l'adresse de la propriété
     */
    
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * Retourne la valeur marchande de la propriété
     */
    public float getValeurDeMarche() {
        return valeurDeMarche;
    }

    /**
     * Modifie la valeur marchande de la propriété
     */
    public void setValeurDeMarche(float valeur) {
        this.valeurDeMarche = valeur;
    }

    public String toString() {
        return "Propriete{"+"adresse="+adresse+", valeurDeMarche=" + valeurDeMarche +
        '}';
    }
}
