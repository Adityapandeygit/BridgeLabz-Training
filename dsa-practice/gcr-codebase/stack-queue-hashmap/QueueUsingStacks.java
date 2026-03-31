package dsa_practice.stack_queue_hashmap_hashfunction;

import java.util.Stack;

public class QueueUsingStacks {
	 Stack<Integer> stackEnq = new Stack<>();
     Stack<Integer> stackDeq = new Stack<>();
     // Enqueue operation
     public void enqueue(int x) {
         stackEnq.push(x);
         System.out.println("Enqueued: " + x);
     }
     // Dequeue operation
     public int dequeue() {
    	 while (!stackEnq.isEmpty()) {
             stackDeq.push(stackEnq.pop());
         }
    	 return stackDeq.pop();
     }
     public int peek() {
         if (stackDeq.isEmpty()) {
             while (!stackEnq.isEmpty()) {
                 stackDeq.push(stackEnq.pop());
             }
         }
         return stackDeq.peek();
     }
     public boolean isEmpty() {
         return stackEnq.isEmpty() && stackDeq.isEmpty();
     }
     
     public static void main(String[] args) {
         QueueUsingStacks q = new QueueUsingStacks();

         q.enqueue(10);
         q.enqueue(20);
         q.enqueue(30);

         System.out.println(q.dequeue()); // 10
         System.out.println(q.peek());    // 20
         System.out.println(q.dequeue()); // 20
     }
}
