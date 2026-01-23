package collections_practice.gcr_codebase.java_collections.queue_Interface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseaQueue {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		Stack<Integer> stack = new Stack<>();

        while (!q.isEmpty()) {
            stack.push(q.remove());
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        System.out.println(q);
	}
}
