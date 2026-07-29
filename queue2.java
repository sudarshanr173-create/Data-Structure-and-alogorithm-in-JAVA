import java.util.*;

public class queue2 {

    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();

        }
    }

    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addlast(data);

        }

        public int remove() {
            return deque.removefirst();
        }

        public int peek() {
            return deque.getfirst();
        }

    }

    static class Stack {
        Deque<Integer> deque = new Linkedlist<>();

        public void push(int data) {
            deque.addlast(data);

        }

        public int pop() {
            return deque.removelast();
        }

        public int peek() {
            return deque.getlast();
        }

    }

    public static void main(String args[]) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("peek = " + s.peek());
        // System.out.println(q.remove);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
    }
}