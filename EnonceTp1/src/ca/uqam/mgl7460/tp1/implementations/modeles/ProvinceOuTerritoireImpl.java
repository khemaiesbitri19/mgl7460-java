package ca.uqam.mgl7460.tp1.implementations.modeles;

import ca.uqam.mgl7460.tp1.types.modeles.ProvinceOuTerritoire;
import java.util.Arrays;
import java.util.List;

/**
 * Petit utilitaire d'implémentation pour travailler avec l'énumération
 * {@link ca.uqam.mgl7460.tp1.types.modeles.ProvinceOuTerritoire} depuis
 * le package des implementations.
 *
 * Remarque: {@code ProvinceOuTerritoire} est une enum définie dans le package
 * `types.modeles`. Cette classe ne la ré-implémente pas; elle fournit juste
 * quelques méthodes utilitaires (affichage lisible, parsing tolérant, liste).
 */
public final class ProvinceOuTerritoireImpl {
    private final ProvinceOuTerritoire province;

    public ProvinceOuTerritoireImpl(ProvinceOuTerritoire province) {
        this.province = province;
    }

    public ProvinceOuTerritoire getEnum() {
        return province;
    }

    public String name() {
        return province == null ? null : province.name();
    }

    /**
     * Retourne un nom lisible pour l'affichage (ex: NEWFOUNDLAND_AND_LABRADOR -> Newfoundland And Labrador)
     */
    public String toDisplayName() {
        if (province == null) return "";
        String s = province.name().toLowerCase().replace('_', ' ');
        String[] parts = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].isEmpty()) continue;
            String p = parts[i];
            sb.append(Character.toUpperCase(p.charAt(0)));
            if (p.length() > 1) sb.append(p.substring(1));
            if (i < parts.length - 1) sb.append(' ');
        }
        return sb.toString();
    }

    /**
     * Parse de manière tolérante une chaîne vers l'enum (retourne null si introuvable)
     */
    public static ProvinceOuTerritoire safeValueOf(String name) {
        if (name == null) return null;
        try {
            return ProvinceOuTerritoire.valueOf(name.trim());
        } catch (IllegalArgumentException ex) {
            // essaie une normalisation: espaces -> underscore, majuscules
            String normalized = name.trim().toUpperCase().replace(' ', '_');
            try {
                return ProvinceOuTerritoire.valueOf(normalized);
            } catch (IllegalArgumentException ex2) {
                return null;
            }
        }
    }

    /**
     * Liste de toutes les valeurs de l'enum (utile pour UI, etc.).
     */
    public static List<ProvinceOuTerritoire> all() {
        return Arrays.asList(ProvinceOuTerritoire.values());
    }

    @Override
    public String toString() {
        return toDisplayName();
    }
}
