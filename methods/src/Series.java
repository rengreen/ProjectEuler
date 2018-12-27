public class Series {

    public static void main(String[] args) {
        int n=10;
        System.out.println("Sum of first "+n+" natural numbers");
        System.out.println(sumOfNaturalNumbers(n));
    }

    //Sum of first n natural numbers
    public static int sumOfNaturalNumbers(int n){
        int sum=n*(n+1)/2;
        return sum;
    }
}
