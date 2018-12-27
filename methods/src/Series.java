public class Series {

    public static void main(String[] args) {
        int n=10;
        System.out.println("Sum of first "+n+" natural numbers");
        System.out.println(sumOfNaturalNumbers(n));

        System.out.println("Sum of squares of first "+n+" natural numbers");
        System.out.println(sumOfNaturalSquares(n));

        System.out.println("Sum of cubes of first "+n+" natural numbers");
        System.out.println(sumOfNaturalCubes(n));
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

    //Sum of cubes of first n natural numbers
    public static int sumOfNaturalCubes(int n){
        int sum=(n*(n+1)/2)*(n*(n+1)/2);
        return sum;
    }
}
