import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Tablica {

    public static void getTablica(Integer[] array){

        List<Integer> list = Arrays.asList(array);
        Collections.reverse(list);
//        System.out.println(list);
        Integer[] newArray = new Integer[list.size()];
        list.toArray(newArray);
        for (int i = 0; i < newArray.length; i++) {
            System.out.printf(newArray[i] +  " ");
        }
    }
}
