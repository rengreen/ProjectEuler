public class CollatzSequence {

    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181

        int n = 10;
        //length of Collatz chain starting from n consecutive numbers
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": " + lengthOfChain(i));
        }
    }

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
}
