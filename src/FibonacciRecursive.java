import java.math.BigInteger;

public class FibonacciRecursive {

    public static BigInteger fib(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }
        return fib(n - 1).add(fib(n - 2));
    }

    public static void main(String[] args) {
        int n = 46;
        System.out.println(fib(n));
    }
}
