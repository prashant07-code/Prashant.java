package vj;

public class factorial {
    public static void main(String[] args) {
        int number = 5; 
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
