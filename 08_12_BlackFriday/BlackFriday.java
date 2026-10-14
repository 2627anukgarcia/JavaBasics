import java.util.Scanner;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price:");
        double price = scanner.nextDouble();
        System.out.println("Do you have a loyalty card? (yes/no):");
        String answer = scanner.next();

        boolean hasCard = answer.equalsIgnoreCase("yes");
        double discount;

        if (price > 60) {
            if (hasCard) {
                discount = 0.20;
            } else {
                discount = 0.10;
            }
        } else {
            if (hasCard) {
                discount = 0.05;
            } else {
                discount = 0.0;
            }
        }

        double finalPrice = price * (1 - discount);

			System.out.printf("Final price: %.2f €%n", finalPrice);

        scanner.close();
    }
}