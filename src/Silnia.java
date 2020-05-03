import java.util.Scanner;

import static java.lang.Integer.toBinaryString;

public class Silnia {

    public static int silnia(int a) {
        if (a < 1) {
            return 1;
        }
        return a * silnia(a - 1);
    }

    public static String toBinary(int a) {
        return toBinaryString(silnia(a));
    }

    public static void binaryCount(int a) {
        String str = Integer.toBinaryString(a);
        char[] charArray = Integer.toBinaryString(a).toCharArray();
        int c = 0;
        int d = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == '1'){
                c++;
            }
        }
        for (int i = 0; i < charArray.length-1; i++) {
            if (charArray[i] == '1' && charArray[i+1] == '0'){
                d++;
            }
        }
        System.out.printf("%-1d %d", c, d);
    }
}
