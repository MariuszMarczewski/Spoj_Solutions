import java.util.Arrays;
import java.util.List;

public class Rol {

    public static void moveArray(Integer[] array) {

        Integer[] newArray = new Integer[array.length - 1];
        newArray[newArray.length - 1] = array[1];
        newArray[0] = array[2];

        for (int i = 1; i < newArray.length - 1; i++) {
            for (int j = 3; j < array.length; j++) {
                newArray[i] = array[j];
            }
        }
        int w = 0;
        for (int k = 0; k < newArray.length - 1; k++) {
            System.out.println(newArray[k]);
        }
    }
}
