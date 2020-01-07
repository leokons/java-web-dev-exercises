package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        int miles = input.nextInt();
        System.out.println("How many gallons of fuel did you use?");
        int gallons = input.nextInt();
        input.close();

        int mph = miles / gallons;
        System.out.println ("Your car can drive " + mph + " miles on 1 gallon of fuel.");
    }
}
