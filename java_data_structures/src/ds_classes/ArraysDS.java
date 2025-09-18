package ds_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDS {

    public static void main(String[] args) {
        // creating an Array
        String[] backToSchoolItems = { "pencil", "book", "eraser", "shoes", "uniform" };
        System.out.print("backToSchool Before Spaces: " + Arrays.toString(backToSchoolItems));
        System.out.print("\n");

        ArrayList<String> spacedOut = addSpaces(backToSchoolItems);
        System.out.print("backToSchool After Spaces: " + spacedOut);

        System.out.print("\n");

        ArrayList<String> strippedSpaces = removeSpaces(backToSchoolItems);
        System.out.print("backToSchool strippedSpaces Spaces: " + strippedSpaces);

        int noOfItemsNeeded = backToSchoolItems.length;
        System.out.print("Total items: " + noOfItemsNeeded);

        int[] numbers = { 7, 17, -13, 19, 5 };

        int[] newNumber = incrementArray(numbers);
        System.out.print(Arrays.toString(newNumber) + "\n");

    }

    public static ArrayList<String> removeSpaces(String[] words) {
        ArrayList<String> noSpaces = new ArrayList<>();

        for (String word : words) {
            noSpaces.add(word.strip());
        }

        return noSpaces;
    }

    // Increment each number in the 'numbers' array by one
    public static int[] incrementArray(int[] numbers) {
        int elementPosition = 0;

        for (int number : numbers) {
            numbers[elementPosition] = (number + 1);
            elementPosition++;
        }
        System.out.print("Numbers: " + Arrays.toString(numbers));
        return numbers;
    }

    public static ArrayList<String> addSpaces(String[] words) {
        ArrayList<String> spacedWords = new ArrayList<>();

        for (String word : words) {
            spacedWords.add(" " + word.concat(" "));
        }

        return spacedWords;
    }

}
