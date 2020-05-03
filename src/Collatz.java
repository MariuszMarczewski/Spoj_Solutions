public class Collatz {

    public static int getNumber(int a){
        int count = 0;
        while(a != 1) {
            if (a % 2 != 0) {
                a = 3 * a + 1;
            }
            a = a / 2;
            count++;
        }
        return count;
    }
}
