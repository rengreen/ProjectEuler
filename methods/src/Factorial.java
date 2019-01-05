public class Factorial {

    public static void main(String[] args) {
        int n = 12;

        System.out.println("factorial of "+n+" using iteration (method for numbers <= 12)");
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        int product = 1;

        for (int i = 2; i <= n; i++) {
            product = product * i;
        }
        return product;
    }
}
