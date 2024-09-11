package RegistrationClass1;

public class RegistrationTester {
        public static void main(String[] args) {
            RegistrationClass reg = new RegistrationClass();

            reg.setEmail("user1@yahoo.com");
            reg.setUserName("username22");
            reg.setPassword("password1");

            System.out.println("Email: " + reg.getEmail());
            System.out.println("Username: " + reg.getUserName());
            System.out.println("Password: " + reg.getPassword());
        }
    }
