import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        int n=12;
        System.out.println("factorial of "+n+" using iteration (method for numbers <= 12)");
        System.out.println(factorial(n));

        System.out.println("factorial of "+n+" using recursion (method for numbers <= 12)");
        System.out.println(factorialRecursive(n));

        System.out.println("factorial of "+n+" using iteration (method for numbers > 12)");
        System.out.println(bigFactorial(n));

        n=99;
        System.out.println("factorial of "+n+" using iteration (method for numbers > 12)");
        System.out.println(bigFactorial(n));
    }

    public static int factorial(int n) {
        int product = 1;

        for (int i = 2; i <= n; i++) {
            product = product * i;
        }
        return product;
    }

    public static long factorialRecursive(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorialRecursive(n - 1);
    }

    public static BigInteger bigFactorial(int n) {
        BigInteger product = BigInteger.ONE;
        for (int i=2; i <= n; i++){
            product = product.multiply(BigInteger.valueOf(i));
        }
        return product;
    }
}
