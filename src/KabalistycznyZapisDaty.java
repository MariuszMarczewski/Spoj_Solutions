import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KabalistycznyZapisDaty {

    public static int kabala(String str){

        char[] charArray = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('k', 10);
        map.put('l', 20);
        map.put('m', 30);
        map.put('n', 40);
        map.put('o', 50);
        map.put('p', 60);
        map.put('q', 70);
        map.put('r', 80);
        map.put('s', 90);
        map.put('t', 100);
        map.put('v', 200);
        map.put('x', 300);
        map.put('y', 400);
        map.put('z', 500);

        List<Integer> integersList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for(Map.Entry<Character, Integer> entry: map.entrySet()){
                if (charArray[i] == entry.getKey()){
                    integersList.add(entry.getValue());
                }
            }
        }
        return integersList.stream()
                .reduce(0, Integer::sum);
    }
}
