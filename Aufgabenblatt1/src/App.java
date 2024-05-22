public class App {
    public static void main(String[] args) throws Exception {
        // HiWI
        String nameHiwi = "Vinzenz Geisler";
        Uebungsgruppe groupHiWI;
        String strasseDHGE = "Weg der Freundschaft 4";
        String plzGera = "07546";
        String ortGera = "Gera"; 
        
        Adresse adresseDHGE = new Adresse(strasseDHGE, plzGera, ortGera);
        Hiwi firstHiwi = new Hiwi(nameHiwi, adresseDHGE, groupHiWI);
    }
}

class Hiwi {
    String name;
    Uebungsgruppe gruppe;
    Adresse adresse;

    public Hiwi(String name, Adresse adresse, Uebungsgruppe gruppe) {
        this.name = name;
        this.gruppe = gruppe;
        this.adresse = adresse;
    }
    
    Uebungsgruppe getGruppe() {
        return gruppe;
    }
    
    String getName() {
        return name;
    }

    Adresse getAdresse() {
        return adresse;
    }
}
class Adresse {
    private String strasse;
    private String plz;
    private String Wohnort;

    public Adresse(String strasse, String plz, String ort) {
        this.strasse = strasse;
        this.plz = plz;
        this.Wohnort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    String getPLZ() {
        return plz;
    }

    String Wohnort() {
        return Wohnort;
    }
}

class Uebung{}
class Uebungsgruppe{}
class Vorlesung{}