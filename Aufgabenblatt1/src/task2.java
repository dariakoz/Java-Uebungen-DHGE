public class task2 {
    public static void main(String[] args)  {
        String myName = "Vinzenz Geisler";
        Vorgesetzten vorgesetzten = new Vorgesetzten("Thomas Heinze");
        Arbeiter myWorker = new Arbeiter(myName, vorgesetzten);
        
        System.out.println("Name: " + myWorker.getName());
        System.out.println("Gehalt: " + myWorker.getGehalt());
        System.out.println("Arbeitszeit: " + myWorker.getWorkTime() + " Stunden");
        System.out.println("Vorgesetzter: " + myWorker.getVorgesetzten().getName());

        System.out.println("------------------------------------ \n            Neue Daten");
        myWorker.getVorgesetzten().setName("Sven Feldmann");
        myWorker.setName("Phillip Stephan");
        System.out.println("Name: " + myWorker.getName());
        System.out.println("Vorgesetzter: " + myWorker.getVorgesetzten().getName());
    }
}


class Arbeiter {
    private String name;
    private int workTime = 40; //vereinfachte Darstellung der Arbeitszeit
    private int gehalt = 3000;
    private Vorgesetzten vorgesetzten;

    public Arbeiter(String name, Vorgesetzten vorgesetzten) {
        this.name = name;
        this.vorgesetzten = vorgesetzten;
    }

    public String getName() {
        return this.name;
    }
    
    public Vorgesetzten getVorgesetzten() {
        return this.vorgesetzten;
    }

    public int getWorkTime() {
        return this.workTime;
    }

    public int getGehalt() {
        return this.gehalt;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}

class Vorgesetzten {
    private String name;
    public Vorgesetzten(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}