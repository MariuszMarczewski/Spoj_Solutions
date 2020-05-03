import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Zliczacz {

    public static void literowaMapka(){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("wpisz dowolne zdanie: ");
        char[] array = sb.append(in.nextLine()).toString().replace(" ", "").toCharArray();
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            for (Map.Entry<Character, Integer> litera : map.entrySet() ){
//                if(map.containsKey(c)){
//                    map.put(c, map.get(c) + 1);
//                } else {
//                    map.put(c, 1);
//                }
                map.put(array[i], 1);
            }
        }

        int w = 0;

        StringBuilder sbnEW = new StringBuilder();
        int overallCount = 0;
        for (Map.Entry<Character, Integer> charEl : map.entrySet()){
            sbnEW.append(charEl.getKey());
            sbnEW.append(charEl.getValue());
        }
        System.out.println(sbnEW.toString());
    }

}
