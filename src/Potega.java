public class Potega {

    public static void Potega(int a, int b){
        int c = (int) Math.pow(a, b);
        if (c < 10){
            System.out.println(c);
        }
        String str = Integer.valueOf(c).toString();
        System.out.println(str.substring(str.length()-1));
    }

}
