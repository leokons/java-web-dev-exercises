package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                Double radius = 0.0;
                do {
                    System.out.println("Enter a radius: ");
                    radius = input.nextDouble();
                } while (radius <= 0.0);
                System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius) + ".");
                flag = false;
            } catch (Exception e) {
                System.err.println("This isn't a number.");
                input.next();
                //e.printStackTrace();
            }
        }
        input.close();


    }
}

