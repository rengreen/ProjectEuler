public class FibonacciSequence {

    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181

        int n = 10;
        //n first Fibonacci numbers
        for (int i = 0; i <= n; i++) {
            System.out.println(i + ": " + fibonacciElement(i));
        }

        //sum of n first Fibonacci numbers
        System.out.println(fibonacciSum(n));
        System.out.println(fibonacciSumSimple(n));
    }

    public static int fibonacciElement(int n){
        if (n <= 1)
            return n;
        return fibonacciElement(n - 1) + fibonacciElement(n - 2);
    }

    public static int fibonacciSum(int n){
        int sum=fibonacciElement(n+2)-1;
        return sum;
    }

    public static int fibonacciSumSimple(int n){
        int sum=0;
        for (int i=0; i<=n; i++){
            sum+=fibonacciElement(i);
        }
        return sum;
    }
}
