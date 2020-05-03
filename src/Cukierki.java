import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cukierki {

    public static int przedszkolanka(int a, int b) {
        if (a % b == 0) {
            return a;
        } else if (b % a == 0) {
            return b;
        }
        List<Integer> dzielniki = new ArrayList<>();
        if (a < b) {
            for (int i = 2; i < a; i++) {
                if (a % i == 0 && b % i == 0) {
                    dzielniki.add(i);
                }
            }
        }
        int c = dzielniki.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .get();

        return a * b / c;
    }
}
