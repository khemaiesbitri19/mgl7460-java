package ca.uqam.mgl7460.tp1.implementations.modeles;

import ca.uqam.mgl7460.tp1.types.modeles.Adresse;
import ca.uqam.mgl7460.tp1.types.modeles.ProvinceOuTerritoire;
import java.util.Objects;

public class AdresseImpl {
    private final String numeroPorte;
    private final String numeroRue;
    private final String nomRue;
    private final String ville;
    private final ProvinceOuTerritoire province;
    private final String codePostal;

    public AdresseImpl(String numeroPorte, String numeroRue, String nomRue, String ville, ProvinceOuTerritoire province, String codePostal) {
        this.numeroPorte = Objects.requireNonNull(numeroPorte, "numeroPorte");
        this.numeroRue = Objects.requireNonNull(numeroRue, "numeroRue");
        this.nomRue = Objects.requireNonNull(nomRue, "nomRue");
        this.ville = Objects.requireNonNull(ville, "ville");
        this.province = Objects.requireNonNull(province, "province");
        this.codePostal = Objects.requireNonNull(codePostal, "codePostal");
    }

    public String getNumeroPorte() { return numeroPorte; }
    public String getNumeroRue() { return numeroRue; }
    public String getNomRue() { return nomRue; }
    public String getVille() { return ville; }
    public ProvinceOuTerritoire getProvince() { return province; }
    public String getCodePostal() { return codePostal; }

    public String toString() {
        return String.format("Porte %s, %s rue %s, %s, %s %s", numeroPorte, numeroRue, nomRue, ville, province, codePostal);
    }

    /**
     * Convertit cette implémentation vers l'objet `types.modeles.Adresse`.
     */
    public Adresse toAdresse() {
        return new Adresse(numeroPorte, numeroRue, nomRue, ville, province, codePostal);
    }

    /**
     * Crée une instance d'implémentation
     */
    public static AdresseImpl from(Adresse a) {
        if (a == null) return null;
        return new AdresseImpl(a.getNumeroPorte(), a.getNumeroRue(), a.getNomRue(), a.getVille(), a.getProvince(), a.getCodePostal());
    }
}

