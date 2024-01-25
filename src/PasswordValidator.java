import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Password Length: 8-22
            // Include Numbers, Lowercase, Uppercase, Begin With A Letter
            // Include Symbols: !";#$%&'()*+,-./:;<=>?@[]^_`{|}~
            String regex = "^(?=[A-Za-z])(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[A-Za-z\\d!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{8,22}$";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);

            if (matcher.matches()) {
                System.out.println("Password is valid. Welcome!");
                break;
            } else {
                System.out.println("Invalid password. Please try again.");
            }
        } while (true);

        scanner.close();
    }
}