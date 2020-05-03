public class RownanieLiniowe {

    public static void isSolution(double a, double b, double c){
        if (a == 0){
            if (b == c){
                System.out.println("NWR");
            }
            System.out.println("BR");
        }
        System.out.println((c - b) / a);
    }
}
