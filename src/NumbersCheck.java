import java.util.Scanner;

public class NumbersCheck {

    static boolean isPrime = true;
    static Scanner input = new Scanner(System.in);
    static String canBeDivided = "Number can be divided by:";

    static void getNumberInfo(int a) {
        if (a >= 0) {
            System.out.println("Number " + a + " is positive.");
        } else {
            System.out.println("Number " + a + " is negative.");
        }

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && a > 0) {
            System.out.println("Number is prime.");
        } else {
            System.out.println("Number isn`t prime.");
        }

        if (a % 2 == 0) {
            System.out.println(canBeDivided + " 2");
        }
        if (a % 5 == 0) {
            System.out.println(canBeDivided + " 5");
        }
        if (a % 3 == 0) {
            System.out.println(canBeDivided + " 3");
        }
        if (a % 6 == 0) {
            System.out.println(canBeDivided + " 6");
        }
        if (a % 9 == 0) {
            System.out.println(canBeDivided + " 9");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter your number:");
        getNumberInfo(input.nextInt());

    }
}
