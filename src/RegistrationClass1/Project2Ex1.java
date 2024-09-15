package RegistrationClass1;

public class Project2Ex1 {

        public static void main(String[] args) {
            String a = "Hello";
            String b = "World";

            // Print original values
            System.out.println("Original values:");
            System.out.println("a: " + a);
            System.out.println("b: " + b);

            // Swap without using a temporary variable
            StringBuilder sb = new StringBuilder();
            sb.append(a).append(b); // Concatenate strings
            b = sb.substring(0, sb.length() - b.length()); // Extract original a
            a = sb.substring(b.length()); // Extract original b

            // Print swapped values
            System.out.println("\nSwapped values:");
            System.out.println("a: " + a);
            System.out.println("b: " + b);
        }

}
