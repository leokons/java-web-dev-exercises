package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String search = "Alice was beginning to get very tired of sitting by her sister on the bank, and" +
                "of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        input.close();

        if(search.toLowerCase().contains(word.toLowerCase())) {
            System.out.println("Your word was found!");
        } else {
            System.out.println("Your word wasn't found!");
        }


    }
}
