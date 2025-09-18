package ds_classes;

import java.util.ArrayDeque;
import java.util.Deque;

public class StacksClass {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        stack.push("First request");
        stack.push("Second request");
        stack.push("Third request");

        Deque<Integer> stackInteger = new ArrayDeque<>();
        stackInteger.push(2);
        stackInteger.push(3);
        stackInteger.push(5);
        stackInteger.push(7);
        stackInteger.push(10);

        stackInteger.removeFirst();
        stackInteger.addFirst(11);

        System.out.print(stackInteger);

    }
}
