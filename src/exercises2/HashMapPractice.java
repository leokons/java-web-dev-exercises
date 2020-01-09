package exercises2;

import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int id;
        System.out.println("Enter your IDs (or ENTER to finish): ");

        do {
            System.out.println("ID: ");
            id = input.nextInt();
            input.nextLine();
            Integer.parseInt()

            if (!(id==0)) {
                System.out.println("Name: ");
                String name = input.next();
                students.put(id, name);
                input.nextLine();
            }
        } while (!(id==0));

        System.out.println(students);

        System.out.println("\nRoster:");

        for(Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " - " + student.getValue());
        }

    }
}
