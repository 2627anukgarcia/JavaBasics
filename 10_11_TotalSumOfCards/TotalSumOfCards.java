import java.util.Scanner;

public class TotalSumOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total1 = 0;
        int total2 = 0;
        int input;

        System.out.println("PLAYER 1");
        for (int count = 1; count <= 4; count++) {
            System.out.println("Enter the value of card " + count + " for player 1:");
            input = scanner.nextInt();

            while (input <= 0 || input > 12) {
                System.out.println("Wrong card, please enter 1..12:");
                input = scanner.nextInt();
            }
            total1 += input;
        }

        System.out.println(" ");
        System.out.println("PLAYER 2");
        for (int count = 1; count <= 4; count++) {
            System.out.println("Enter the value of card " + count + " for player 2:");
            input = scanner.nextInt();

            while (input <= 0 || input > 12) {
                System.out.println("Wrong card, please enter 1..12:");
                input = scanner.nextInt();
            }
            total2 += input;
        }

        System.out.println(" ");
        System.out.println("RESULTS");
        System.out.println("Total cards Player 1: " + total1);
        System.out.println("Total cards Player 2: " + total2);

        if (total1 > total2) {
            System.out.println("Player 1 has won!");
        }else if (total1 < total2) {
            System.out.println("Player 2 has won!");
        }else {
            System.out.println("It is a draw.");
        }

        scanner.close();
    }
}