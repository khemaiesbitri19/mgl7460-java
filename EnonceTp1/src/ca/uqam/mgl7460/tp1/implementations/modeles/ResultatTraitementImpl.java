package ca.uqam.mgl7460.tp1.implementations.modeles;

import ca.uqam.mgl7460.tp1.types.modeles.Resultat;
import ca.uqam.mgl7460.tp1.types.modeles.ResultatTraitement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Elle stocke le résultat du traitement d'une demande de prêt
 * (NONDETERMINE, ACCEPTEE ou REFUSEE),
 * ainsi qu'une liste de messages expliquant les décisions.
 */
public class ResultatTraitementImpl implements ResultatTraitement {

    /** Résultat du traitement */
    private Resultat resultat;

    /** Messages associés au traitement */
    private List<String> messages;

    /**
     * Constructeur par défaut : initialise avec NONDETERMINE
     */
    public ResultatTraitementImpl() {
        this.resultat = Resultat.NONDETERMINE;
        this.messages = new ArrayList<>();
    }

    public ResultatTraitementImpl(Resultat resultat) {
        this.resultat = resultat;
        this.messages = new ArrayList<>();
    }

    /**
     * Retourne le résultat (NONDETERMINE, ACCEPTEE, REFUSEE)
     */

    public Resultat getResultat() {
        return resultat;
    }

    /**
     * Modifie le résultat
     */
    public void setResultat(Resultat resultat) {
        this.resultat = resultat;
    }

    /**
     * Retourne un itérateur sur les messages collectés
     */
    public Iterator<String> getMessages() {
        return messages.iterator();
    }

    /**
     * Ajoute un message explicatif
     */
    
    public void ajouteMessage(String message) {
        this.messages.add(message);
    }

    public String toString() {
        return "ResultatTraitement{" +"resultat="+resultat+", messages=" + messages +
    '}';
    }
}
