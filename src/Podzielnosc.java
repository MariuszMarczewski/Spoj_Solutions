import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Podzielnosc {

    public static List<Integer> getDzielniki(int n, int x, int y){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (i % x == 0 && i % y != 0){
                list.add(i);
            }
        }
        Collections.sort(list);
        return list;
    }
}
