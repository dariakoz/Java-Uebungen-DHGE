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

        // LB
        String nameLB = "Phillip Stephan";
        Uebung uebungLB;
        String strasseDHGE2 = "Weg der Freundschaft 5";
        String plzGera2 = "07547";
        String ortGera2 = "Gera2"; 
        
        Adresse adresseDHGE2 = new Adresse(strasseDHGE, plzGera, ortGera);
        Lehrbeauftragter firstLB = new Lehrbeauftragter(nameLB, adresseDHGE2, uebungLB);

        // Prof
        String nameProf = "Oliver Seide";
        Vorlesung vorlesungProf;
        String strasseDHGE3 = "Weg der Freundschaft 6";
        String plzGera3 = "07548";
        String ortGera3 = "Gera3"; 
        
        Adresse adresseDHGE3 = new Adresse(strasseDHGE, plzGera, ortGera);
        Professor firstProf = new Professor(nameProf, adresseDHGE3, vorlesungProf);
    }
}

class Hiwi {
    private String name;
    private Uebungsgruppe gruppe;
    private Adresse adresse;

    public Hiwi(String name, Adresse adresse, Uebungsgruppe gruppe) {
        this.name = name;
        this.gruppe = gruppe;
        this.adresse = adresse;
    }
    
    public Uebungsgruppe getGruppe() {
        return this.gruppe;
    }
    
    public String getName() {
        return this.name;
    }

    public Adresse getAdresse() {
        return this.adresse;
    }
}
class Lehrbeauftragter {
    private String name;
    private Uebung uebung;
    private Adresse adresse;

    public Lehrbeauftragter(String name, Adresse adresse, Uebung uebung) {
        this.name = name;
        this.uebung = uebung;
        this.adresse = adresse;
    }
    
    public Uebung getUebung() {
        return this.uebung;
    }
    
    public String getName() {
        return this.name;
    }

    public Adresse getAdresse() {
        return this.adresse;
    }
}
class Professor {
    private String name;
    private Vorlesung vorlesung;
    private Adresse adresse;

    public Professor(String name, Adresse adresse, Vorlesung vorlesung) {
        this.name = name;
        this.vorlesung = vorlesung;
        this.adresse = adresse;
    }
    
    public Vorlesung getVorlesung() {
        return this.vorlesung;
    }
    
    public String getName() {
        return this.name;
    }

    public Adresse getAdresse() {
        return this.adresse;
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
        return this.strasse;
    }

    public String getPLZ() {
        return this.plz;
    }

    public String Wohnort() {
        return this.Wohnort;
    }
}

class Uebung{}
class Uebungsgruppe{}
class Vorlesung{}