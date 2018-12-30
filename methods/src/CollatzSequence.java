public class CollatzSequence {

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
