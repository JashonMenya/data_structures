package ds_classes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> shoppingList = new LinkedList<>();

        shoppingList.add("Apple");
        shoppingList.add("Banana");
        shoppingList.add("Pear");

        // display
        System.out.print(shoppingList);

        // add by index
        shoppingList.add(1, "Mango");
        System.out.print(shoppingList);

        // removin element
        shoppingList.remove(0);
        shoppingList.remove("Pear");
        System.out.print(shoppingList);

        System.out.print(shoppingList.size());

        String item = shoppingList.pop();
        System.out.print("Item popped from shopping list: " + item);
        System.out.print(shoppingList);

        List<String> synchronizedList = Collections.synchronizedList(shoppingList);
        System.out.print("\n Synchronized shopping list: " + synchronizedList);
    }
}
