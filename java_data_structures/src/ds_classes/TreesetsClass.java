package ds_classes;

import java.util.*;

public class TreesetsClass {
    public static void main(String[] args) {
        // A tree store unique elements in a sorted order

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(1);
        treeSet.add(300);
        treeSet.add(47);
        treeSet.add(6);

        System.out.print(treeSet);

        Set<String> wordSet = new TreeSet<>(Comparator.comparing(String::length));// sorting by length of word
        wordSet.add("tiger");
        wordSet.add("giraffee");
        wordSet.add("bear");
        wordSet.add("wolf"); // this wont be included because it has 4 letters as well
        System.out.print(wordSet);

    }
}
