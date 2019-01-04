public class Palindrome {
    public static void main(String[] args) {

        int start = 100;
        int end = 200;
        System.out.println("Is it palindromic number?");
        for (int i = start; i <= end; i++) {
            System.out.println(i + ": " + isPalindrome(i));
        }
    }

    public static boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        String r=new StringBuilder(s).reverse().toString();
        return s.equals(r);
    }
}
