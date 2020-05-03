public class Imieniny {

    public static boolean isHappy(int a, int b) {

        if (a > b) {
            return true;
        }
        for (int i = 1; i <= a; i++) {
            if (b % (a * i) == 0) {
                return false;
            }
        }
        return true;
    }
}
