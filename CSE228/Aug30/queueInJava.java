import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;
/**
 * queueInJava
 */
public class queueInJava {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);
        queue.add(500);
        queue.add(600);
        System.out.println("queue peek is " + queue.peek());
        System.out.println("queue is " + queue);
        System.out.println(queue.remove());
        System.out.println("queue is " + queue);
    }
}