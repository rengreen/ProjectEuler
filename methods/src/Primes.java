import java.util.*;

public class Primes {

    public static void main(String[] args) {
        //first 100 prime numbers
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
        //73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173,
        //179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281,
        //283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409,
        //419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541,

        int maxValue = 37;

        System.out.println("prime numbers not greater then " + maxValue);
        for (Integer item: primesUnder(maxValue)) {
            System.out.println(item);
        }
    }

    public static Boolean[] sieveOfEratosthenes(int maxValue){
        Boolean sieve[] = new Boolean[maxValue+1];
        for(int i=2; i<=maxValue; i++)
            sieve[i]=true;

        for(int p = 2; p*p<=maxValue; p++) {
            if(sieve[p]) {
                for(int i = p*p; i <= maxValue; i += p) {
                    sieve[i] = false;
                }
            }
        }
        return sieve;
    }

    //list of prime numbers not greater than given maxValue
    public static List<Integer> primesUnder(int maxValue){
        List<Integer> primesUnder=new ArrayList<>();
        for (int i = 2; i <= maxValue; i++) {
            if (sieveOfEratosthenes(maxValue)[i]) {
                primesUnder.add(i);
            }
        }
        return primesUnder;
    }
}