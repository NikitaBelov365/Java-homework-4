import java.util.LinkedList;
import java.util.Queue;

public class Second {
    public static Queue<String> enqueue(Queue<String> my_Queue, String text) {
        my_Queue.offer(text);
        return my_Queue;
    }

    public static String  dequeue(Queue<String> my_Queue) {
        return my_Queue.poll();
    }

    public static String first(Queue<String> my_Queue) {
        return my_Queue.peek();
    }

    public static void main(String[] args) {
        Queue<String> my_Queue = new LinkedList<>(); 
        for (int i = 0; i < 10; i++) {
            my_Queue.add("Igor" + i);
        }
        System.out.println(enqueue(my_Queue, "GGGGGG"));
        System.out.println(dequeue(my_Queue));
        System.out.println(my_Queue.toString());
        System.out.println(first(my_Queue));
    }
}
