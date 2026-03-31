package collections_practice.gcr_codebase.java_collections.queue_Interface;

class CircularBuffer {
    private int[] buffer;
    private int size;
    private int front = 0;
    private int rear = 0;
    private int count = 0;

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    // Insert element
    public void insert(int value) {
        buffer[rear] = value;
        rear = (rear + 1) % size;

        if (count < size) {
            count++;
        } else {
            front = (front + 1) % size;
        }
    }

    // Display buffer
    public void display() {
        if (count == 0) {
            System.out.println("Buffer is empty");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println();
    }
}

public class CircularBufferSimulation {
	public static void main(String[] args) {

        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();   // 1 2 3

        cb.insert(4);
        cb.display();   // 2 3 4
    }
}
