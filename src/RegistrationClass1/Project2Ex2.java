package RegistrationClass1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Project2Ex2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a string:");
            String input = scanner.nextLine();
            scanner.close();

            // Use HashSet to store unique alphabetic characters
            Set<Character> uniqueChars = new HashSet<>();

            // Iterate over each character in the string
            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    uniqueChars.add(Character.toLowerCase(c));
                }
            }

            // Output the number of unique alphabetic characters
            System.out.println("Number of unique alphabetic characters: " + uniqueChars.size());
        }

}
