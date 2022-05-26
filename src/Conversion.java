import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of USD you want to exchange.");
        double sumOfMoney = input.nextDouble();

        System.out.println("Enter the exchange rate to convert to your currency.");
        double exchangeRate = input.nextDouble();

        double result = sumOfMoney * exchangeRate;

        System.out.println(sumOfMoney + " USD with exchange rate of " + exchangeRate + " is " + result + " EUR.");
    }
}
