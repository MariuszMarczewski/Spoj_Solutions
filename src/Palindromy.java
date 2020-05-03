public class Palindromy {

    public static boolean isPalindrome(int a){
        int remainder = 0;
        int reverseInteger = 0;

        while (a > 0) {
            remainder = a % 10;
            reverseInteger = reverseInteger * 10 + remainder;
            a /= 10;
        }
        if (reverseInteger == a) {
            return true;
        } else {
            return false;
        }
    }
}
