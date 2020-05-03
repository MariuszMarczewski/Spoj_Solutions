import java.util.ArrayList;
import java.util.List;

public class ZliczanieLiczbIWyrazow {

    public static void zliczanie(String str){
        String[] stringArray = str.split(" ");
        int countStrings = 0;
        int countIntegers = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].matches("[a-zA-Z]*")){
                countStrings++;
            } else if(stringArray[i].matches("[0-9]*")) {
                countIntegers++;
            }
        }
        System.out.printf("%-1d %d %n", countStrings, countIntegers);
    }
}
