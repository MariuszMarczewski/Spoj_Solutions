public class SzyfrCezara {

    public static String szyfr(String str){
        char[] array = str.toCharArray();

        for (int i = 0; i != array.length; i++) {
            int n = array[i];
            n += 3;
            array[i] = (char) n;
        }

        return new String(array);
    }
}
