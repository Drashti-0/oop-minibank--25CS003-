public class Driver {

    public static void main(String[] args) {

        PasswordChecker p = new PasswordChecker();

        String[] password = {
                "abc",
                "Abcd1234!",
                "Hello12",
                "Test@123"
        };

        for (int i = 0; i < password.length; i++) {

            System.out.println("---------------------");
            System.out.println("Password : " + password[i]);

            String ans = p.strength(password[i]);

            System.out.println("Strength : " + ans);
        }
    }
}