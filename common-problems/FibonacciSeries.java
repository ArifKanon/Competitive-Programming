
public class FibonacciSeries {

    // Recursion 1 without using loop
    public static void fibonacci(int num1, int num2, int seq) {
        if (num1 == 0)
            System.out.print(num1 + " " + num2 + " ");

        int sum = num1 + num2;
        System.out.print(sum + " ");

        if (seq > 3)
            fibonacci(num2, sum, --seq);
    }

    // Recursion 2 using loop
    public static int fibonacciSequence(int count) {
        if (count <= 1)
            return count;
        return fibonacciSequence(count - 1) + fibonacciSequence(count - 2);
    }

    // Main method
    public static void main(String[] args) {
        int seq = 20;
        // Recursion 1
        fibonacci(0, 1, seq);

        System.out.println();
        // Recursion 2 using loop
        for (int i = 0; i < seq; i++)
            System.out.print(fibonacciSequence(i) + " ");
    }

}
