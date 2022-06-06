import java.util.Scanner;

public class Bank {
    static Scanner scanner = new Scanner(System.in);

    static void creditInfo() {
        int creditAmount = 5000;
        System.out.println("Your credit amount is : " + creditAmount);
        System.out.println("Enter the deposit amount:");
        int sum = scanner.nextInt();
        System.out.println("You payed: " + sum);
        creditAmount -= sum;
        System.out.println("Left to pay: " + creditAmount);
        if (creditAmount <= 0) {
            System.out.println("Congratulations! You have paid the amount owed.");
        } else {
            System.out.println("The loan is not repaid.");
        }
    }

    public static void main(String[] args) {
        creditInfo();
    }

}
