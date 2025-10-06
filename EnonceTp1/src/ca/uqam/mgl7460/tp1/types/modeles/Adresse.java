package ca.uqam.mgl7460.tp1.types.modeles;

import java.util.Objects;

/**
 * Représentation d'une adresse (classe immuable pour compatibilité Java).
 */
public final class Adresse {
    private final String numeroPorte;
    private final String numeroRue;
    private final String nomRue;
    private final String ville;
    private final ProvinceOuTerritoire province;
    private final String codePostal;

    public Adresse(String numeroPorte, String numeroRue, String nomRue, String ville, ProvinceOuTerritoire province, String codePostal) {
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

    @Override
    public String toString() {
        return String.format("Porte %s, %s rue %s, %s, %s %s", numeroPorte, numeroRue, nomRue, ville, province, codePostal);
    }
}
