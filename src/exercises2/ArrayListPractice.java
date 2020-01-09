package exercises2;

import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        /*
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        //System.out.println(arr.get(2));
        */

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
        System.out.println("Sum of all the even numbers is " + ArrayListMethod.getSum(arr) +".");

        //ArrayList<String> newArr = new ArrayList<>(Arrays.asList("mouse", "pencil", "pen", "phone", "books", "paper", "door", "happy"));
        String oneString = new String ("I would not, could not, in a box. I would not, could not with a fox. I will not eat them " +
                "in a house. I will not eat them with a mouse.");
        oneString = oneString.replace(".", "").replace(",", "");

        ArrayList<String> newArr = new ArrayList<String>(Arrays.asList(oneString.split(" ")));

        Scanner input = new Scanner (System.in);
        System.out.println("Enter word length for search: ");
        int n = input.nextInt();
        input.close();

        System.out.println("Words that have exactly " + n + " letters: " + ArrayListMethod2.printWord(newArr, n) +".");
//        ArrayList<String> newArr2 = ArrayListMethod2.printWord(newArr, n);
//        for(String s: newArr2){
//            System.out.println(s);
//        }
    }
}
