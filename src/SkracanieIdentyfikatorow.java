import java.util.ArrayList;
import java.util.List;

public class SkracanieIdentyfikatorow {

    public static void check(String str, int n){
        String variable = str.trim();
        String reverse = "";

        for(int i = variable.length() - 1; i >= 0; i--)
        {
            reverse = reverse + variable.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);

        List<Character> charList = new ArrayList<>();

//        reverse.chars()
//                .mapToObj(c -> (char) c)
//                .filter(c -> c.equals("_"))
//                .findFirst()
//                .ifPresentOrElse(
//                        character -> {charList.add(character)};
//
//                );


        System.out.println(charList);
    }
}
