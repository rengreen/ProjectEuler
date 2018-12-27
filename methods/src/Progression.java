public class Progression {
    public static void main(String[] args) {

        int n=10;
        System.out.println("Sum of first "+n+" natural numbers");
        System.out.println(sumArithmeticProgression(1, n, n));
    }

    //Sum of first n terms of an Arithmetic Progression
    //
    public static int sumArithmeticProgression(int first, int last, int numberOfTerms){
        int sum=numberOfTerms*(first+last)/2;
        return sum;
    }
}
