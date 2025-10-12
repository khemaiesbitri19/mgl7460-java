package ca.uqam.mgl7460.tp1.implementations.modeles;

import ca.uqam.mgl7460.tp1.types.modeles.TermesPret;

/**
 * Utilitaires pour travailler avec {@link ca.uqam.mgl7460.tp1.types.modeles.TermesPret}.
 */
public final class TermesPretImpl {
    private final int amortissement;
    private final float tauxInteret;

    public TermesPretImpl(int amortissement, float tauxInteret) {
        this.amortissement = amortissement;
        this.tauxInteret = tauxInteret;
    }

    public int getAmortissement() { return amortissement; }
    public float getTauxInteret() { return tauxInteret; }

    public TermesPret toTermesPret() {
        return new TermesPret(amortissement, tauxInteret);
    }

    public static TermesPretImpl from(TermesPret t) {
        if (t == null) return null;
        return new TermesPretImpl(t.getAmortissement(), t.getTauxInteret());
    }

    public String toDisplayString() {
        return String.format("%d mois à %.2f%%", amortissement, tauxInteret);
    }

    /**
     * Parse une chaîne de la forme "<amortissement> mois à <taux>%" ou le toString()
     */
    public static TermesPretImpl parse(String s) {
        if (s == null) return null;
        try {
            // tentative simple: extraire deux nombres
            String cleaned = s.replaceAll("[^0-9.,%]", " ").trim();
            String[] parts = cleaned.split("\\s+");
            if (parts.length < 2) return null;
            int amort = Integer.parseInt(parts[0]);
            String tauxStr = parts[1].replace(',', '.').replace("%", "");
            float taux = Float.parseFloat(tauxStr);
            return new TermesPretImpl(amort, taux);
        } catch (Exception ex) {
            return null;
        }
    }
}
