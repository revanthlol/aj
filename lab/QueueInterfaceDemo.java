// Program to demonstrate Queue Interface and its implementations

import java.util.*;

public class QueueInterfaceDemo {
    public static void main(String[] args) {

        Queue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("Banana");
        priorityQueue.add("Apple");
        priorityQueue.add("Cherry");

        System.out.println("\nPriorityQueue: " + priorityQueue);
        System.out.println("Peek: " + priorityQueue.peek());

        while (!priorityQueue.isEmpty()) {
            System.out.println("Removed: " + priorityQueue.poll());
        }

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Front");
        deque.addLast("Middle");
        deque.addLast("Rear");

        System.out.println("\nArrayDeque: " + deque);

        System.out.println("First Element: " + deque.peekFirst());
        System.out.println("Last Element: " + deque.peekLast());

        System.out.println("Remove First: " + deque.pollFirst());
        System.out.println("Remove Last: " + deque.pollLast());

        System.out.println("After Removals: " + deque);
    }
}