package ca.uqam.mgl7460.tp1.implementations.modeles;

import ca.uqam.mgl7460.tp1.types.modeles.DemandePret;
import ca.uqam.mgl7460.tp1.types.modeles.DemandeurPret;
import ca.uqam.mgl7460.tp1.types.modeles.Propriete;
import ca.uqam.mgl7460.tp1.types.modeles.ResultatTraitement;
import ca.uqam.mgl7460.tp1.types.modeles.TermesPret;
import java.time.Instant;
import java.util.UUID;


public class DemandePretImpl implements DemandePret {

    /** Numéro unique de la demande */
    private final String numeroDemande;

    /** Date de création de la demande */
    private final Instant dateDemande;

    /** Demandeur (emprunteur-se) */
    private final DemandeurPret demandeurPret;

    /** Propriété mise en garantie */
    private final Propriete propriete;

    /** Montant du prêt demandé */
    private final float montantPret;

    /** Montant de la mise de fonds */
    private float montantMiseDeFonds;

    /** Prix d’achat de la propriété */
    private float prixAchat;

    /** Résultat du traitement (ACCEPTEE, REFUSEE, NONDETERMINE) */
    private ResultatTraitement resultatTraitement;

    /** Termes du prêt (taux d’intérêt et durée) */
    private TermesPret termesPret;

    public DemandePretImpl(Propriete propriete, DemandeurPret demandeurPret, float prixAchat, float montantMiseDeFonds) {
        this.numeroDemande = UUID.randomUUID().toString();
        this.dateDemande = Instant.now();
        this.propriete = propriete;
        this.demandeurPret = demandeurPret;
        this.prixAchat = prixAchat;
        this.montantMiseDeFonds = montantMiseDeFonds;
        this.montantPret = prixAchat - montantMiseDeFonds;
        this.resultatTraitement = new ResultatTraitementImpl(); // initialise à NONDETERMINE
    }

    /** Retourne le numéro unique de la demande */
    public String getNumeroDemande() {
        return numeroDemande;
    }

    /** Retourne la date de création de la demande */
    public Instant getDateDemande() {
        return dateDemande;
    }

    /** Retourne le demandeur */
    
    public DemandeurPret getDemandeurPret() {
        return demandeurPret;
    }

    /** Retourne la propriété mise en garantie */
    
    public Propriete getPropriete() {
        return propriete;
    }

    /** Retourne le montant du prêt demandé */
    public float getMontantPret() {
        return montantPret;
    }

    /** Retourne le montant de la mise de fonds */
    
    public float getMontantMiseDeFonds() {
        return montantMiseDeFonds;
    }

    /** Modifie le montant de la mise de fonds */
    public void setMontantMiseDeFonds(float montant) {
        this.montantMiseDeFonds = montant;
    }

    /** Retourne le résultat de traitement */
    public ResultatTraitement getResultatTraitement() {
        return resultatTraitement;
    }

    /** Modifie le résultat de traitement */
    public void setResultatTraitement(ResultatTraitement etat) {
        this.resultatTraitement = etat;
    }

    /** Retourne le ratio emprunt/valeur de marché */
    public float getRatioEmpruntValeur() {
        if (propriete.getValeurDeMarche() <= 0) return 0f;
        return montantPret / propriete.getValeurDeMarche();
    }

    /** Retourne le prix d’achat de la propriété */
    public float getPrixAchat() {
        return prixAchat;
    }

    /** Modifie le prix d’achat */
    public void setPrixAchat(float prixAchat) {
        this.prixAchat = prixAchat;
    }

    /** Retourne les termes du prêt */
    public TermesPret getTermesPret() {
        return termesPret;
    }

    /** Modifie les termes du prêt */
    public void setTermesPret(TermesPret terms) {
        this.termesPret = terms;
    }
    public String toString() {
        return "DemandePret{" +
                "numeroDemande='" + numeroDemande + '\'' +
                ", dateDemande=" + dateDemande +
                ", demandeurPret=" + demandeurPret +
                ", propriete=" + propriete +
                ", prixAchat=" + prixAchat +
                ", montantMiseDeFonds=" + montantMiseDeFonds +
                ", montantPret=" + montantPret +
                ", resultatTraitement=" + resultatTraitement +
                '}';
    }
}
