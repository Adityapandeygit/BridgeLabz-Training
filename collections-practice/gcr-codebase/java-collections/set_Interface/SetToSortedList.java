package collections_practice.gcr_codebase.java_collections.set_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToSortedList {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        System.out.println(list);
    }
}
