import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rep = 0;
        boolean fin=false;

        while (!fin){
            ArrayList<Livre> liste = new ArrayList<>();
            TreeSet<Livre> test= new TreeSet<>();
            TreeSet<Livre> test1= new TreeSet<>(new Compareur());

            Livre1(liste);
            Livre1(test);
            Livre1(test1);

            System.out.println("Quelle méthode voulez-vous tester?");
            System.out.println("1- Faite par moi.");
            System.out.println("2- Juste par année.");
            System.out.println("3- Elle classer par toute.");
            System.out.println("4- TreeSet sans comparator");
            System.out.println("5- TreeSet avec comparator");
            rep = sc.nextInt();

            switch (rep) {
                case 1:
                    ordre(liste);
                    attributsListe(liste);
                    break;//Regardez que les années
                case 2:
                    Collections.sort(liste);
                    attributsListe(liste);
                    break;//Regardez que les années
                case 3:
                    Collections.sort(liste,new Compareur());
                    attributsListe(liste);
                    break;//regarder la premiere lettre et les années 2001-2002
                case 4:
                   attributsPourTreeSet(test);
                    break;//Regardez année
                case 5:
                    attributsPourTreeSet(test1);
                    break;//Regardez la premiere lettre et les années 2001-2002
            }

            System.out.println("Voulez-vous tester un autre méthode?(o/n)");
            char rep1='d';
            rep1=sc.next().toLowerCase().charAt(0);

            if (rep1=='n'){
                fin=true;
            }
        }



    }

    public static void ordre(ArrayList<Livre> liste) {
        int plusPetit;
        Livre livre;
        for (int i = 0; i < liste.size(); i++) {
            plusPetit = i;
            livre = liste.get(i);
            for (int j = i; j < liste.size(); j++) {
                if (livre.compareTo(liste.get(j)) > 0) {
                    livre = liste.get(j);
                    plusPetit = j;
                }

            }
            liste.remove(plusPetit);
            liste.add(i,livre);
        }

    }

    public static void attributsListe(ArrayList<Livre> liste){
        for (int i=0;i<liste.size();i++){
            System.out.println("Année: "+liste.get(i).getAnnee());
            System.out.println("Titre: "+liste.get(i).getTitre());
            System.out.println("Sous-Titre: "+liste.get(i).getSousTitre());
            System.out.println("Auteur: "+liste.get(i).getAuteur());
            System.out.println("Maison Édition: "+liste.get(i).getMaisonEdition());
            System.out.println("ISBN: "+liste.get(i).getISBN());
            System.out.println("---------------------------------------------");
        }
    }
    public static void attributsPourTreeSet(Collection<Livre> liste){
        for (Livre livre : liste){
            System.out.println("Année: "+livre.getAnnee()+" Titre: "+livre.getTitre()+" Sous-Titre: "+livre.getSousTitre()+" Auteur: "+livre.getAuteur()+" Maison Édition: "+livre.getMaisonEdition()+" ISBN: "+livre.getISBN());
        }
    }

    public static void Livre1(Collection<Livre> liste){
        liste.add(new Livre(2000, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "BBB", "BOB", "PAS", "111111"));
        liste.add(new Livre(2004, "CCCCCCCCCCCC", "DDD", "COC", "MES", "222222"));
        liste.add(new Livre(2007, "EEEEEEE", "FFF", "DOD", "NIS", "333333"));
        liste.add(new Livre(2002, "GGG", "HHH", "EOE", "LOS", "444444"));
        liste.add(new Livre(2001, "GGG", "HHH", "EOE", "LOS", "444444"));
        liste.add(new Livre(2003, "KKK", "LLL", "GOG", "QAS", "666666"));
        liste.add(new Livre(9999, "MMM", "NNN", "HOH", "RAS", "777777"));
        liste.add(new Livre(23, "OOO", "PPP", "IOI", "ZAS", "888888"));
        liste.add(new Livre(2005, "QQQ", "RRR", "JOJ", "OAS", "999999"));
        liste.add(new Livre(1999, "SSS", "TTT", "KOK", "WAS", "000000"));
    }
}