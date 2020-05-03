
import java.util.Scanner;

public class Samolot {

    public static int getSeats() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę rzędów w klasie biznesowej: ");
        int n1 = in.nextInt();
        System.out.println("Podaj liczbę rzędów w klasie ekonomicznej: ");
        int n2 = in.nextInt();
        System.out.println("Podaj ilość siedzeń w rzędzie klasy biznesowej: ");
        int k1 = in.nextInt();
        System.out.println("Podaj ilość siedzeń w rzędzie klasy ekonomicznej: ");
        int k2 = in.nextInt();

        return n1 * k1 + n2 * k2;
    }
}
