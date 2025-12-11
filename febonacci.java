package vj;

public class febonacci {
    public static void main(String[] args) {
        
        int a = 0, b = 1;
        System.out.println("Fibonacci series with values <= 100:");

        
        while (a <= 100) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
