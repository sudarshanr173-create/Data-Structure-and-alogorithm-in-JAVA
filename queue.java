import java.util.*;

public class queue {
    //
    public static void reverse(Stack<Integer> q) {
        Stack<Integer> s = new LinkedList<>();
        while (!q.isEmpty) {
            s.push(q.remove());
        }
        while (!s.isEmpty) {
            q.add(s.remove());
        }
    }

    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String args[]) {
        // String str = "aabccxb";
        // PrintNonRepeating(str);
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        // interLeave(q);
        reverse(q);
        while (!q.isEmpty) {

            System.out.println(q.remove() + " ");
        }
        System.out.println(" ");

    }
}

// push(1);
// push(2);
// push(3);

// while (!isEmpty()) {
// System.out.println(peek());
// pop();
// }
// }

// public static void main(String args[]) {
// queue q = new queue();
// q.add(1);
// q.add(2);
// q.add(3);

// System.out.println(q.remove()); // 1

// q.add(4);
// System.out.println(q.remove()); // 2
// q.add(5);
// System.out.println(q.remove()); // 3

// public static void main(String[] args) {
// Queue<Integer> queue = new LinkedList<>();
// queue.add(1);
// queue.add(2);
// queue.add(3);
// System.out.println("Queue: " + queue);
