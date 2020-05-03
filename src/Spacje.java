import java.util.Arrays;
import java.util.List;

public class Spacje {

    public static void getSentence(String str) {
        String[] array = str.split(" ");
        List<String> strings = Arrays.asList(array);
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        System.out.println(sb.toString());
    }
}
