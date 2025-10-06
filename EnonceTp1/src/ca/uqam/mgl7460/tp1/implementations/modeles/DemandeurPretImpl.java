package ca.uqam.mgl7460.tp1.implementations.modeles;

import ca.uqam.mgl7460.tp1.types.modeles.DemandeurPret;

/**
 * Cette classe représente les demendeur-se-s de prêt.
 */
public class DemandeurPretImpl implements DemandeurPret {

    private String nom;
    private String prenom;
    private String nas;
    private float revenuAnnuel;
    private float obligationsAnnuelles;
    private int scoreCredit;

    public DemandeurPretImpl(String prenom, String nom, String nas, float revenuAnnuel, float obligationsAnnuelles, int scoreCredit) {
        this.prenom = prenom;
        this.nom = nom;
        this.nas = nas;
        this.revenuAnnuel = revenuAnnuel;
        this.obligationsAnnuelles = obligationsAnnuelles;
        this.scoreCredit = scoreCredit;
    }

    /**
     * Retourne le nom 
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne le prénom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Retourne le numéro d’assurance sociale
     */
    public String getNas() {
        return nas;
    }

    /**
     * Retourne le revenu annuel brut
     */
    
    public float getRevenuAnnuel() {
        return revenuAnnuel;
    }

    /**
     * Modifie le revenu annuel brut
     * @param revenu Nouveau revenu annuel
     */
    public void setRevenuAnnuel(float revenu) {
        this.revenuAnnuel = revenu;
    }

    /**
     * Retourne les obligations financières annuelles incompressibles
     */
    public float getObligationsAnnuelles() {
        return obligationsAnnuelles;
    }

    /**
     * Modifie les obligations financières annuelles incompressibles
     * @param obligations nouvelles obligations
     */
    public void setObligationsAnnuelles(float obligations) {
        this.obligationsAnnuelles = obligations;
    }

    /**
     * Retourne le taux d’endettement (obligations/revenu)
     */
    public float getTauxEndettement() {
        if (revenuAnnuel <= 0) return 0f;
        return obligationsAnnuelles / revenuAnnuel;
    }

    /**
     * Retourne la cote de crédit
     */
    
    public int getScoreCredit() {
        return scoreCredit;
    }

    /**
     * Modifie la cote de crédit
     */
    
    public void setScoreCredit(int score) {
        this.scoreCredit = score;
    }

    public String toString() {
        return "DemandeurPret{" +
                "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", nas='" + nas + '\'' +
                ", revenuAnnuel=" + revenuAnnuel +
                ", obligationsAnnuelles=" + obligationsAnnuelles +
                ", scoreCredit=" + scoreCredit +
                '}';
    }
}
