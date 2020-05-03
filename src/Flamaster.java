import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Flamaster {

    public static void getFlamaster(){
        Scanner in = new Scanner(System.in);
        System.out.println("Wpisz dowolny ciąg znaków literowych: ");
        String str = in.nextLine();
        char[] array = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++){
            char c = array[i];

            if (map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        int overallCount = 0;

        for (Map.Entry<Character, Integer> charEl : map.entrySet()){
                sb.append(charEl.getKey());
                sb.append(charEl.getValue());

        }
        System.out.println(sb.toString().replace("1", "").replace("2", ""));
    }
}
