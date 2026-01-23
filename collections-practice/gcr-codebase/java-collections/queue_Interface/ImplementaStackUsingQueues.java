package collections_practice.gcr_codebase.java_collections.queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>(); 

    public void push(int n) {
        q1.add(n);

        int size = q1.size();
        for (int i = 0; i < size - 1; i++) {
            q1.add(q1.poll());
        }
    }

    public int pop() {
        return q1.poll();   
    }

    public int top() {
        return q1.peek();   
    }
}

public class ImplementaStackUsingQueues {

    public static void main(String[] args) {

        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // 3
        System.out.println(stack.top()); // 2
    }
}
