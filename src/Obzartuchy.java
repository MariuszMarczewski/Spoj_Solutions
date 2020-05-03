import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Obzartuchy {

    public static int getBoxCount(int a, int b) {
        List<Integer> speedList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            System.out.println("Podaj żwawość obżartucha: ");
            speedList.add(in.nextInt());
        }
        List<Integer> donutList = new ArrayList<>();
        for (int i = 0; i < speedList.size(); i++) {
            donutList.add((int) 86400 / speedList.get(i));
        }
        Integer sum = donutList.stream()
                      .reduce(0, Integer::sum);
      if (b > sum){
          return 1;
      }
      List<Integer> mnozniki = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            if (b * i > sum) {
               mnozniki.add(i);
            }
        }
       return mnozniki.stream()
               .min(Comparator.comparing(Integer::valueOf))
               .get();
    }
}
