import java.util.Stack;

public class nextgreater {
    public static void main(String[] args) {
        int arr[] = {6, 7, 9, 3, 0};
        Stack<Integer> S = new Stack<>();
        int nxtgreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!S.isEmpty() && arr[S.peek()] <= arr[i]) {
                S.pop();
            }
            if (S.isEmpty()) {
                nxtgreater[i] = -1;
            } else {
            
            
                nxtgreater[i] = arr[S.peek()];
            }
            S.push(i);
        }

        for (int i = 0; i < nxtgreater.length; i++) {
            System.out.print(nxtgreater[i] + " ");
        }
        System.out.println();
    }
}

