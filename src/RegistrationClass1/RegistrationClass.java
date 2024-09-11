package RegistrationClass1;

public class RegistrationClass {
        private String email;
        private String userName;
        private String password;

        public void setEmail(String email) {
            if (email.endsWith("@yahoo.com")) {
                this.email = email;
            } else {
                System.out.println("Invalid email. Only Yahoo emails are accepted.");
            }
        }

        public void setUserName(String userName) {
            if (userName != null && userName.length() > 6) {
                this.userName = userName;
            } else {
                System.out.println("Invalid username. It must be non-empty and longer than 6 characters.");
            }
        }

        public void setPassword(String password) {
            if (password != null && password.length() > 6 && !password.contains(userName)) {
                this.password = password;
            } else {
                System.out.println("Invalid password. It must be non-empty, longer than 6 characters, and cannot contain the username.");
            }
        }

        public String getEmail() {
            return email;
        }

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }

}
