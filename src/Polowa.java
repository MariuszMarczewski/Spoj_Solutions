public class Polowa {

    public static String getPolowa(String str){
        if(str.length() % 2 != 0){
            return str;
        }
        return str.substring(0, str.length() / 2);
    }
}
