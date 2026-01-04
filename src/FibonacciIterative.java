import java.math.BigInteger;

public class FibonacciIterative  {

    public static BigInteger fib(int n) {
        if (n <= 1) return BigInteger.valueOf(n);

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger temp = a.add(b);
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 46;


        BigInteger result = fib(n);
        System.out.println(result);

    }
}
