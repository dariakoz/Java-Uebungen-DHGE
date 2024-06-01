public class App {
    public static void main(String[] args) throws Exception {
        ListElement firstElement = new ListElement(1, null);
        VerketteteListe myList = new VerketteteListe(3);

        myList.displayElements();

        System.out.println("\nEin ELement wird gelöscht");
        myList.deleteElement(6);
        myList.displayElements();

        System.out.println("\nDie 3 als ELement vorhanden: " + myList.searchElement(3));
    }
}

class ListElement {
    int data;
    ListElement next;

    public ListElement(int data, ListElement next) {
        this.data = data;
        this.next = next;
    }
}

class VerketteteListe {
    ListElement head;
    ListElement tail;

    public VerketteteListe(int data) {
        head = new ListElement(1, null);
        tail = head;
        head.next = tail;
    }

    public void newElement(int data) {
        ListElement nextElement = new ListElement(data, null);
        tail.next = nextElement;
        tail = nextElement;
    }


    public void displayElements() {

        ListElement currentElement = head;

        while (currentElement != null) {
            System.out.print(currentElement.data + " -> ");
            currentElement = currentElement.next;
        }

        System.out.print("null");
    }

    public void deleteElement(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        ListElement currentElement = head;
        while (currentElement.next != null && currentElement.next.data != data) {
            currentElement = currentElement.next;
        }
        
        if (currentElement.next != null) {
            currentElement.next = currentElement.next.next;
        }
    }

    //Hier ist noch ein Fehler
    public boolean searchElement(int data) {
        ListElement currentElement = head;
        while (currentElement != null) {
            if (currentElement.data == data) {
                return true;
            }
            currentElement = currentElement.next;
        }
        return false;

    }
}