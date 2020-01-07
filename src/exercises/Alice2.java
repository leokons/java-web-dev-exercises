package exercises;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class Alice2 {
    public static void main(String[] args) {
        String search = "Alice was beginning to get very tired of sitting by her sister on the bank, and" +
                "of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        input.close();


        String[] wordPosition = search.toLowerCase().split(" ");
        boolean test = Arrays.asList(wordPosition).contains(word.toLowerCase());

        if (test) {

            for (int i=0; i<wordPosition.length; i++) {
                if (wordPosition[i].equals(word.toLowerCase())) {
                    int position = i+1;
                    System.out.println("Your word " + "'" + word + "'" + " has index " + position + ".");

                }
            }
            System.out.println("Your word " + "'" + word + "'" + " has " + word.length() + " letters.");


        } else {
            System.out.println("Your word wasn't found!");
        }
    }
}
