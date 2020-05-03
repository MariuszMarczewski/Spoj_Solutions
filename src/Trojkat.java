import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trojkat {

    public static void isTrojkat(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static void isTrojkatDeLuxe(){
        Scanner in = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        while (in.hasNext()) {
            System.out.println("Podaj dowolną liczbę: ");
            list.add(in.nextDouble());
        }

        System.out.println(list);
    }
}
