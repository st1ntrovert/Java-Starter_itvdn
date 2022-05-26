import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose operation: +, -, * or / :");
        switch (input.nextLine()) {
            case "+":
                System.out.println("Enter the first number first, then the second.");
                Arithmetics.add(input.nextInt(), input.nextInt());
                break;
            case "-":
                System.out.println("Enter the first number first, then the second.");
                Arithmetics.sub(input.nextInt(), input.nextInt());
                break;
            case "*":
                System.out.println("Enter the first number first, then the second.");
                Arithmetics.mul(input.nextInt(), input.nextInt());
                break;
            case "/":
                System.out.println("Enter the first number first, then the second.");
                Arithmetics.div(input.nextInt(), input.nextInt());
                break;
            default:
                System.out.println("Please, Try Again :)");
                break;
        }

    }

}