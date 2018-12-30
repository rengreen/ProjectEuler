import java.util.ArrayList;

public class CollatzSequence {

    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181

        int n = 10;
        System.out.println("lengths of Collatz chains");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": " + lengthOfChain(i));
        }

        System.out.println("Collatz chains");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            for (long item : collatzChain(i)) {
                System.out.print(item + " ");
            }
            System.out.println("");
        }
    }
    //length of Collatz chain - from starting number to 1
    public static int lengthOfChain(int startNumber){
        int counter=0;
        long current=startNumber;
        long next=0L;
        while (next!=1L){
            if (current%2L==0L){
                next=current/2L;
            } else {
                next=3L*current+1L;
            }
            current=next;
            counter++;
        }
        return counter;
    }

    //Collatz chain - from starting number to 1
    public static ArrayList<Long> collatzChain(int startNumber){
        ArrayList<Long> chain = new ArrayList<Long>();
        long current=startNumber;
        long next=0L;
        while (next!=1L){
            if (current%2L==0L){
                next=current/2L;
            } else {
                next=3L*current+1L;
            }
            chain.add(next);
            current=next;
        }
        return chain;
    }
}
