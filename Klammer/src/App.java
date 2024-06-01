import java.util.Scanner;

public class App {
    public static boolean isTopNull(Stack stack) {
        if (stack.top == null) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws Exception {

        //Text Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie einen Text ein: ");
        String input = scanner.nextLine();
        System.out.println("Sie haben folgendes eingegeben: " + input);
        scanner.close();

        // //Klassische Variante um String zu durchlaufen
        // for (int i = 0; i < input.length(); i++) {
        //     char c = input.charAt(i);
        //     System.out.println(c);
        // }
        Stack myStack = new Stack(null);

        //Moderne Variante um String zu durchlaufeno
        for (char c : input.toCharArray()) {

            switch (c) {
                case '(':
                    myStack.push(c);
                    break;
            
                case ')':
                    if (isTopNull(myStack)) {
                        System.out.println("Fehlende Öffnung einer Klammer");
                        return;
                    }
                    if (myStack.top.klammer == '(') {
                        myStack.pop();
                    }
                    else { 
                        System.out.println("Fehlende Schließung der letzten Klammer");
                        return;
                    }
                    break;

                case '[':
                    myStack.push(c);
                    break;
                
                case ']':
                    if (isTopNull(myStack)) {
                        System.out.println("Fehlende Öffnung einer Klammer");
                        return;
                    }
                    if (myStack.top.klammer == '[') {
                        myStack.pop();
                    }
                    else { 
                        System.out.println("Fehlende Schließung der letzten Klammer");
                        return;
                    }
                    break;
                    
                case '{':
                    myStack.push(c);
                    break;

                case '}':
                    if (isTopNull(myStack)) {
                        System.out.println("Fehlende Öffnung einer Klammer");
                        return;
                    }
                    if (myStack.top.klammer == '{') {
                        myStack.pop();
                    }
                    else { 
                        System.out.println("Fehlende Schließung der letzten Klammer");
                        return;
                    }
                    break;
                }
            }
            if (!isTopNull(myStack)) {
                System.out.println("Fehlende Schließung einer Klammer");
        }
    }
}


class StackElement {
    char klammer;
    StackElement next;

    public StackElement (char klammer, StackElement next) {
        this.klammer = klammer;
        this.next = next;
    }
}

class Stack {
    StackElement top;

    public Stack(StackElement element) {
        top = element;
    }

    public StackElement push(char klammer) {
        StackElement newTopElement = new StackElement(klammer, top);
        top = newTopElement;

        return newTopElement;
    }

    public StackElement pop() {
        StackElement deletedElement = top;
        top = top.next;

        return deletedElement;
    }
}