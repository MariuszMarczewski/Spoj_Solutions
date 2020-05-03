import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KonkursPseudomatematyczny {

    public static List<Integer> getRanking(Integer[] array) {

        List<Integer> list = Arrays.asList(array);
        Integer max = Collections.max(list);

        List<Integer> winnersList = new ArrayList<>();
        List<Integer> loosersList = new ArrayList<>();
        for (Integer result : list) {
            if (result == max) {
                winnersList.add(result);
            }
            if (result < max) {
                loosersList.add(result);
            }
        }
        Collections.sort(loosersList);
        return Stream.of(winnersList, loosersList)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
