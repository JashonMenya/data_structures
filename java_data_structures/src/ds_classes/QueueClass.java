package ds_classes;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        // FIFO
        Queue<String> messages = new ArrayDeque<>();

        messages.add("message 1");
        messages.add("message 2");
        messages.offer("message 3");

        String gettingServed = messages.remove();
        System.out.print("\nCurrently serving:" + gettingServed);

        System.out.print(messages);
    }
}
