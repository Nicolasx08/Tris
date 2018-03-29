import java.util.Comparator;

public class Compareur implements Comparator<Livre> {
    @Override
    public int compare(Livre o1, Livre o2) {
        int maisonEd=o1.getMaisonEdition().compareTo(o2.getMaisonEdition());
        if (maisonEd==0){
            int auteur= o1.getAuteur().compareTo(o2.getAuteur());
            if (auteur==0){
                int titre=o1.getTitre().compareTo(o2.getTitre());
                if (titre==0){
                    return o1.getAnnee()-o2.getAnnee();
                }
                return titre;
            }
            return auteur;
        }
        return maisonEd;
    }
}
