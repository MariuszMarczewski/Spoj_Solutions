import java.util.Arrays;

public class ReversedArrays {

    public static void reverse(Integer[] array){
        int j = array.length;
        Integer[] reversedArray = new Integer[j];
        for (int i = 0; i < array.length; i++) {
            reversedArray[j - 1] = array[i];
            j = j - 1;
        }
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.println(reversedArray[i]);
        }

    }
}
