package ca.uqam.mgl7460.tp1.implementations.modeles;

import ca.uqam.mgl7460.tp1.types.modeles.Resultat;
import java.util.Arrays;
import java.util.List;

/**
 * Utilitaires pour l'enum {@link ca.uqam.mgl7460.tp1.types.modeles.Resultat}.
 */
public final class ResultatImpl {
    private final Resultat resultat;

    public ResultatImpl(Resultat resultat) {
        this.resultat = resultat;
    }

    public Resultat getEnum() { return resultat; }

    public String name() { return resultat == null ? null : resultat.name(); }

    public String toDisplayName() {
        if (resultat == null) return "";
        String s = resultat.name().toLowerCase();
        if (s.equals("nondetermine")) return "Non déterminé";
        if (s.equals("acceptee")) return "Acceptée";
        if (s.equals("refusee")) return "Refusée";
        // fallback
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    public static Resultat safeValueOf(String name) {
        if (name == null) return null;
        try { return Resultat.valueOf(name.trim()); }
        catch (IllegalArgumentException ex) {
            String normalized = name.trim().toUpperCase().replace(' ', '_');
            try { return Resultat.valueOf(normalized); }
            catch (IllegalArgumentException ex2) { return null; }
        }
    }

    public static List<Resultat> all() { return Arrays.asList(Resultat.values()); }

    @Override
    public String toString() { return toDisplayName(); }
}
