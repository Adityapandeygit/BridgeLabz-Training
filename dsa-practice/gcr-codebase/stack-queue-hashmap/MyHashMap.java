package dsa_practice.stack_queue_hashmap_hashfunction;

public class MyHashMap {
	class Node {
        int key;
        String value;
        Node next;

        Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
	private int size = 10;
    private Node[] buckets = new Node[size];

    // Hash function
    private int hash(int key) {
        return key % size;
    }

    // Put key-value
    public void put(int key, String value) {
        int index = hash(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key == key) {
                head.value = value; 
                return;
            }
            head = head.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    // Get value
    public String get(int key) {
        int index = hash(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key == key)
                return head.value;
            head = head.next;
        }
        return null;
    }

    // Remove key
    public void remove(int key) {
        int index = hash(key);
        Node curr = buckets[index];
        Node prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null)
                    buckets[index] = curr.next;
                else
                    prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
    
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "SQL");

        System.out.println(map.get(2)); 

        map.remove(2);
        System.out.println(map.get(2));
    }

}
