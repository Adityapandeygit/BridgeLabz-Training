package dsa_practice.gcr_codebase.linkedlist;
class TextState {
    String content;
    TextState prev;
    TextState next;

    TextState(String content) {
        this.content = content;
    }
}
class TextEditor {
     TextState head;
     TextState current;
     int size;
     final int MAX_HISTORY = 10;

    public void addState(String text) {
        TextState newState = new TextState(text);
        
        if (head == null) {
            head = current = newState;
            size = 1;
            return;
        }

        current.next = null;

        newState.prev = current;
        current.next = newState;
        current = newState;

        if (size < MAX_HISTORY) {
            size++;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo");
        }
    }

    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("Editor is empty");
        }
    }
}
public class FunctionalityTextEditor {
	public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");

        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("Hello Java");
        editor.displayCurrentState();

        editor.redo(); 
    }
}
