
class Solution { // Corrected: lowercase 'c' for class
    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) { // Corrected: 'int i' and 'num.length'
            if (largest < number[i]) { // Corrected: 'num[i]'
                 largest = number[i];
        }
            if (smallest > number[i]) { // Corrected: 'num[i]'
                smallest = number[i];
            }
        }
        System.out.println("smallest is " + smallest);
        return largest;
    }

    public static void main(String args[]) { // Corrected: uppercase 'S' for String
        int number[] = {1, 2, 6, 3, 5};
        System.out.println("largest value is " + getLargest(number));
    }
}