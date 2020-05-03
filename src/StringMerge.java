
import java.util.Map;
import java.util.TreeMap;

public class StringMerge {

    public static void merge(String a, String b){

        char[] charArray1 = a.toCharArray();
        char[] charArray2 = b.toCharArray();
        int num = 0;
        if (charArray1.length > charArray2.length){
            num = charArray2.length;
        }
        num = charArray1.length;
        char[] newArray = new char[num];

        StringBuilder sb = new StringBuilder();

        Map<Character, Character> map = new TreeMap<>();

        for (int i = 0; i < num; i++) {
            map.put(charArray1[i], charArray2[i]);
        }

        for (Map.Entry<Character, Character> mapka : map.entrySet()){
            System.out.println(mapka.getKey() + " " + mapka.getValue());
        }

//        System.out.println(sb.toString());
    }

}
