package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rectangle's length: ");
        int rectangleLength = input.nextInt();
        System.out.println("Enter rectangle's width: ");
        int rectangleWidth = input.nextInt();
        input.close();

        int area = rectangleLength * rectangleWidth;
        System.out.println("Rectangle's area equals " + area + ".");

    }
}
