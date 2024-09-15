package RegistrationClass1;

public class ReveseStringEx3 {
        public static void main(String[] args) {
            String input = "Hello";

            String reversed = reverseString(input);
            System.out.println("Original String: " + input);
            System.out.println("Reversed String: " + reversed);
        }

        public static String reverseString(String str) {
            // Using StringBuilder to reverse the string
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        }

}
