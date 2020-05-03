import java.util.*;

public class ObzartuchyEasy {

    public static int getBoxCount(int b, int d) {

        int donutPerDay = 86400 / b;
        if (d > donutPerDay){
            return 1;
        }
        List<Integer> mnozniki = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            if (d * i > donutPerDay){
                mnozniki.add(i);
            }
        }
        return mnozniki.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .get();
    }
}
