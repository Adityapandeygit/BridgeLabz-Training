package collections_practice.gcr_codebase.java_collections.list_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    // Generic method for any List
    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    public static void main(String[] args) {

        // ArrayList
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);
        }
        System.out.println("Reversed ArrayList: " + reverseList(arrayList));

        // LinkedList
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            linkedList.add(i);
        }
        System.out.println("Reversed LinkedList: " + reverseList(linkedList));
    }
}
