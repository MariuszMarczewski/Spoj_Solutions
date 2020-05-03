import java.util.*;

public class StatystykaPozycyjna {

    public static void statystuj(String str){
        String[] strArray = str.split(" ");
        int rank = Integer.parseInt(strArray[0]);
        SortedSet<Integer> integerSet = new TreeSet<>();
        for (int i = 1; i < strArray.length; i++) {
            integerSet.add(Integer.parseInt(strArray[i]));
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(integerSet);
        Collections.reverse(list);

        int w = 0;

        if (rank > list.size()){
            System.out.println("-");
        } else {
            System.out.println(list.get(rank - 1));
        }
    }
}
