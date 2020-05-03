import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParzysteNieparzyste {

    public static List<Integer> getPary(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        List<Integer> listEven = new ArrayList<>();
        List<Integer> listOdd = new ArrayList<>();
        for (Integer element : list) {
            if (element % 2 == 0) {
                listEven.add(element);
            } else {
                listOdd.add(element);
            }
        }
        return Stream.of(listEven, listOdd)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public static List<Integer> getOddsEvens(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        List<Integer> listEven = new ArrayList<>();
        List<Integer> listOdd = new ArrayList<>();

        for (int i = 1; i <= list.size(); i++) {
            if (i % 2 == 0) {
                listEven.add(list.get(i - 1));
            } else if (i % 2 != 0) {
                listOdd.add(list.get(i - 1));
            }
        }

        int w = 0;

        return Stream.of(listOdd, listEven)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}


