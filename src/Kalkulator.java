import java.util.Arrays;
import java.util.List;

public class Kalkulator {

//    public static void pomozOli(int n) {
//        Scanner in = new Scanner(System.in);
//        List<String> list = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            System.out.println("podaj ciąg wyrażenia arytmetycznego: ");
//            list.add(in.nextLine());
//        }
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).trim().to
//        }
//    }

    public static void checkString(String str) {
        String[] stringArray = str.trim().split("");
        List<String> stringList = Arrays.asList(stringArray);
        String remove = stringList.get(0);
        int wynik = Integer.valueOf(remove);
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).matches("\\+")) {
                wynik += Integer.parseInt(stringList.get(i + 1));
            } else if (stringList.get(i).matches("\\-")) {
                wynik -= Integer.parseInt(stringList.get(i + 1));
            }
        }
        System.out.println(wynik);


    }
}
