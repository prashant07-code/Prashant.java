package vj;

public class prime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int testNum = 29; 
        if (isPrime(testNum)) {
            System.out.println(testNum + " is a prime number.");
        } else {
            System.out.println(testNum + " is not a prime number.");
        }
    }
}
