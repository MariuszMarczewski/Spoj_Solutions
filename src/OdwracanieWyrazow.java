import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OdwracanieWyrazow {

    public static String dajWyraz(String str){

        char[] array = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for(Character element: array){
            list.add(element);
        }
//        StringBuilder sb
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {

        }
        return list.toString();
    }
}
