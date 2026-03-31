package collections_practice.gcr_codebase.java_collections.list_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NthElementfromtheEnd {
	public static String findNthFromLast(LinkedList<String> list ,int n) {
		return list.get(list.size()-n);
	}
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        int n =2;
        System.out.println("N th element from the last : " +findNthFromLast(list,n));
	}
}
