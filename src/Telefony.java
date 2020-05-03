import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Telefony {

    public static void getNumer(String str) {
        List<Integer> numerList = new ArrayList<>();
        Map<String, Integer> map = new TreeMap<>();
        map.put("ABC", 2);
        map.put("DEF", 3);
        map.put("GHI", 4);
        map.put("JKL", 5);
        map.put("MNO", 6);
        map.put("PQRS", 7);
        map.put("TUV", 8);
        map.put("WXYZ", 8);
        for (int i = 0; i < str.length(); i++) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getKey().contains(str.substring(i, i + 1).toUpperCase())) {
                    numerList.add(entry.getValue());
                }
            }
        }
        System.out.println(numerList);
    }
}
