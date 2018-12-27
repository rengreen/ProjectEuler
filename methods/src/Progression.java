public class Progression {
    public static void main(String[] args) {

        int n=10;
        System.out.println("Sum of first "+n+" natural numbers");
        System.out.println(sumArithmeticProgression(1, n, n));

        int m=10;
        System.out.println("Sum of first "+m+" element of 2^n sequence");
        System.out.println(sumGeometricProgression(1, 2, m));
    }

    //Sum of first n terms of an Arithmetic Progression
    public static int sumArithmeticProgression(int first, int last, int numberOfTerms){
        int sum=numberOfTerms*(first+last)/2;
        return sum;
    }

    //Sum of first n terms of an Geometric Progression
    public static int sumGeometricProgression(int scaleFactor, int commonRatio, int numberOfTerms){
        int sum=scaleFactor*((int) Math.pow(commonRatio, numberOfTerms)-1)/(commonRatio-1);
        return sum;
    }
}
