import java.util.*;

public class Srednia {

    public static String getSrednia(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        String result = null;
        double srednia = 0;
        OptionalDouble avg = list.stream()
                .mapToInt(i -> i)
                .average();
        if (avg.isPresent()) {
            srednia = avg.getAsDouble();
        }
        Map<Integer, Double> map = new TreeMap<>();

        for (Integer element : list) {
            map.put(list.get(element), Math.abs(srednia - list.get(element)));
        }
        Optional<Integer> integer = map
                .entrySet()
                .stream()
                .min(Comparator.comparingDouble(Map.Entry::getValue))
                .map(Map.Entry::getKey);
        if(integer.isPresent()){
            result = integer.toString();
        }
        return result;
    }
}
