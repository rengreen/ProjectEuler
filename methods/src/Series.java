public class Series {

    public static void main(String[] args) {
        int n=10;
        System.out.println("Sum of first "+n+" natural numbers");
        System.out.println(sumOfNaturalNumbers(n));

        System.out.println("Sum of squares of first "+n+" natural numbers");
        System.out.println(sumOfNaturalSquares(n));
    }

    //Sum of first n natural numbers
    public static int sumOfNaturalNumbers(int n){
        int sum=n*(n+1)/2;
        return sum;
    }

    //Sum of squares of first n natural numbers
    public static int sumOfNaturalSquares(int n){
        int sum=n*(n+1)*(2*n+1)/6;
        return sum;
    }
}
