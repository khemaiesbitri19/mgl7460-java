package ca.uqam.mgl7460.tp1.types.modeles;

/**
 * Représente les termes d’un prêt hypothécaire.
 *
 * Un terme de prêt est défini par :
 *  - une durée d’amortissement (en mois)
 *  - un taux d’intérêt (en pourcentage)
 */
public final class TermesPret {
    private final int amortissement;
    private final float tauxInteret;

    public TermesPret(int amortissement, float tauxInteret) {
        this.amortissement = amortissement;
        this.tauxInteret = tauxInteret;
    }

    public int getAmortissement() {
        return amortissement;
    }

    public float getTauxInteret() {
        return tauxInteret;
    }

    @Override
    public String toString() {
        return "TermesPret{" + "amortissement=" + amortissement + " mois" + ", tauxInteret=" + tauxInteret + "%" + '}';
    }
}
