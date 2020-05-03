public class Euklides {

    public static int countMoves(int a, int b) {

        while (a != b) {
            if (a > b) {
                a -= b;
            }
            b -= a;
        }
        return a + b;
    }
}
