package org.launchcode.java.studios.areaofacircle;

import java.util.*;

public class Studio2 {
    public static void main(String[] args) {
        /*String text = "If the product of two terms is zero then common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done " +
                "that, it’s pretty straightforward from there."; */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string for counting letters: ");

        String text = input.nextLine().toLowerCase().replaceAll("[^a-z]", "");

        //System.out.println(text);
        char[] charactersInString = text.toCharArray();
        //System.out.println(charactersInString[5]);

        String str;
        Integer num = 1;
        HashMap<Character, Integer> arr = new HashMap<Character, Integer>();
        for (char c : charactersInString) {
            if (!arr.containsKey(c)) {
                arr.put(c, num);
            } else {
                int count = arr.get(c);
                arr.put(c, count+1);
            }

        }
        System.out.println(arr);
    }
}
