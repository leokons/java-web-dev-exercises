package exercises2;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] oneArray = {1, 1, 2, 3, 5, 8};
        for (int i=0; i<oneArray.length; i++) {
            System.out.println(oneArray[i]);
        }
        System.out.println();
        for (int i=0; i<oneArray.length; i=i+2) {
            System.out.println(oneArray[i]);
        }

        System.out.println();
        String oneString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them " +
                "in a house. I will not eat them with a mouse.";
        String [] newArray = oneString.split(" ");
        System.out.println(Arrays.toString(newArray));
        System.out.println(newArray.length);

        System.out.println();
        String secString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them " +
                "in a house. I will not eat them with a mouse.";
        String [] newArray2 = secString.split("\\. ");
        System.out.println(Arrays.toString(newArray2));
        System.out.println(newArray2.length);

    }
}
