package ca.uqam.mgl7460.tp1.implementations.modeles;

import ca.uqam.mgl7460.tp1.types.modeles.Propriete;
import ca.uqam.mgl7460.tp1.types.modeles.Adresse;
import java.util.Objects;
/**
 * Cette classe représente les propriétés 
  */
public class ProprieteImpl implements Propriete {

    /** Adresse de la propriété (immuable dans cette implémentation) */
    private final Adresse adresse;

    /** Valeur marchande de la propriété */
    private float valeurDeMarche;

    public ProprieteImpl(Adresse adresse, float valeurDeMarche) {
        this.adresse = Objects.requireNonNull(adresse, "adresse");
        this.valeurDeMarche = valeurDeMarche;
    }

    /**
     * Retourne l'adresse de la propriété
     */
    
    @Override
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * Retourne la valeur marchande de la propriété
     */
    @Override
    public float getValeurDeMarche() {
        return valeurDeMarche;
    }

    /**
     * Modifie la valeur marchande de la propriété
     */
    @Override
    public void setValeurDeMarche(float valeur) {
        this.valeurDeMarche = valeur;
    }
    @Override
    public String toString() {
        return String.format("Propriete{adresse=%s, valeurDeMarche=%.2f}", adresse, valeurDeMarche);
    }
}
