import java.util.Scanner;

public class CreditCardMasking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your 16-digit credit card number: ");
        String creditCardNumber = scanner.nextLine();
        scanner.close();

        if (creditCardNumber.length() == 16 && creditCardNumber.matches("\\d+")) {
            String maskedCreditCardNumber = "xxxxxxxxxxxx" + creditCardNumber.substring(12);
            System.out.println("Masked Credit Card Number: " + maskedCreditCardNumber);
        } else {
            System.out.println("Invalid input. Please enter a 16-digit credit card number.");
        }
    }
}
