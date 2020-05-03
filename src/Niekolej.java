import java.util.ArrayList;
import java.util.List;

public class Niekolej {

    public static void ifNiekolej(int a) {
        if (a < 4) {
            System.out.println("Nie");
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= a; i++) {
            list.add(i);
        }
        List<Integer> absList = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (Math.abs((list.get(i+1) - list.get(i))) == 1 ){
                absList.add(i+1);
            }
        }

        int w = 0;
        System.out.println(absList);
    }
}

