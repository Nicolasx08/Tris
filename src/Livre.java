public class Livre implements Comparable<Livre> {

    private int annee;
    private String titre;
    private String sousTitre;
    private String auteur;
    private String maisonEdition;
    private String ISBN;

    public Livre(int annee,String titre, String sousTitre, String auteur,String maisonEdition,String ISBN){
        this.annee=annee;
        this.titre=titre;
        this.sousTitre=sousTitre;
        this.auteur=auteur;
        this.maisonEdition=maisonEdition;
        this.ISBN=ISBN;
    }

    @Override
    public int compareTo(Livre o) {
        return annee-(o.annee);
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSousTitre() {
        return sousTitre;
    }

    public void setSousTitre(String sousTitre) {
        this.sousTitre = sousTitre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getMaisonEdition() {
        return maisonEdition;
    }

    public void setMaisonEdition(String maisonEdition) {
        this.maisonEdition = maisonEdition;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}

