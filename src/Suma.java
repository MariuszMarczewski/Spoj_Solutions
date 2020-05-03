import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Suma {

    public static void countSum(){
        int count = 0;
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę: ");
        while(in.hasNext()){
            int a = in.nextInt();
            list.add(a);
            int b = list.stream()
                    .reduce(0, Integer::sum);
            System.out.println(b);
            count++;
            if (count == 10) break;
        }

    }
}
