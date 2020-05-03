import java.util.Map;
import java.util.TreeMap;

public class SzyfrGronsfelda {

    public static void szyfruj(Integer[] keyArray, String str){
        String[] charArray = str.split("");
        String[] codefactor = "ABCDEFGHIJKLMNOPQRSTUWXYZ".split("");

        Map<String, String> codeMap = new TreeMap<>();

        for (int i = 0; i < charArray.length; i++) {
            for(int j = 0; j < keyArray.length; j++){
                
            }

        }
    }

}
