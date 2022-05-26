public class Arithmetics {
    static int result;

    static void add(int a, int b) {
        result = a + b;
        System.out.println("Result is " + result);
    }

    static void sub(int a, int b) {
        result = a - b;
        System.out.println("Result is " + result);
    }

    static void mul(int a, int b) {
        result = a * b;
        System.out.println("Result is " + result);
    }

    static void div(int a, int b) {
        if (b == 0) {
            System.out.println("You can't divide by zero!");
        } else {
            result = a / b;
            System.out.println("Result is " + result);
        }
    }

}
