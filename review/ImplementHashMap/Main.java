package review.ImplementHashMap;


class CustomHashMap<K, V> {

    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int SIZE = 10;
    private Node<K, V>[] buckets;

    public CustomHashMap() {
        buckets = new Node[SIZE];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void put(K key, V value) {
        int index = hash(key);
        Node<K, V> curr = buckets[index];

        while (curr != null) {
            if (curr.key.equals(key)) {
                curr.value = value;
                return;
            }
            curr = curr.next;
        }

        Node<K, V> node = new Node<>(key, value);
        node.next = buckets[index];
        buckets[index] = node;
    }

    public V get(K key) {
        int index = hash(key);
        Node<K, V> curr = buckets[index];

        while (curr != null) {
            if (curr.key.equals(key))
                return curr.value;
            curr = curr.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        Node<K, V> curr = buckets[index];
        Node<K, V> prev = null;

        while (curr != null) {
            if (curr.key.equals(key)) {
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
}



public class Main {
	public static void main(String[] args) {
		CustomHashMap<String, Integer> map = new CustomHashMap<>();

        // put values in Hashmap
        map.put("Apple", 100);
        map.put("Banana", 50);
        map.put("Orange", 80);

        // GET values
        System.out.println(map.get("Apple"));   
        System.out.println(map.get("Banana"));  

        // UPDATE value
        map.put("Apple", 120);
        System.out.println(map.get("Apple"));   

        // REMOVE value
        map.remove("Orange");

        // CHECK key existence
        System.out.println(map.get("Orange")); 

       
	}
}

