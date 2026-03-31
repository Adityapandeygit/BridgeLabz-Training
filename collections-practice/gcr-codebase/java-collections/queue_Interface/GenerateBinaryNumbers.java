package collections_practice.gcr_codebase.java_collections.queue_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenerateBinaryNumbers {
	public static List<String> generateBinary(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < n; i++) {
            String current = queue.remove();
            result.add(current);

            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(generateBinary(n));
    }
}
