package ua.ithillel.part1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //test countOccurance()
        ArrayList<String> words = new ArrayList<>(Arrays.asList("bob", "uwu", "uwu", "ger", "bob", "bob", "uwu", "uwu", "ger", "bob", "bob", "uwu", "uwu", "ger", "bob"));

        System.out.println(countOccurance(words, "uwu"));
        System.out.println(countOccurance(words, "ger"));

        //test toList()
        int[] testIntArray = new int[]{1, 2, 3};
        System.out.println(toList(testIntArray));

        //test findUnique()
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);

        System.out.println(numbers);
        System.out.println(findUnique(numbers));

    }

    public static int countOccurance(ArrayList<String> arrayList, String string) {
        int k = 0;
        for (String element : arrayList) {
            if (element == string) {
                k++;
            }
        }
        return k;
    }

    public static ArrayList<Integer> toList(int[] intArray) {
        ArrayList<Integer> intList = new ArrayList<>(intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            intList.add(intArray[i]);
        }
        return intList;
    }

    public static ArrayList<Integer> findUnique(ArrayList<Integer> intList) {
        ArrayList<Integer> uniqueIntList = new ArrayList<>();

        for (Integer element : intList) {
            if (!uniqueIntList.contains(element)) {
                uniqueIntList.add(element);
            }
        }
        return uniqueIntList;
    }
}