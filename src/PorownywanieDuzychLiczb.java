public class PorownywanieDuzychLiczb {

    public static void zliczacz(String str){
        String[] strArray = str.split(" ");
        int firstInteger = Integer.parseInt(strArray[0]);
        int secondInteger = Integer.parseInt(strArray[2]);
        if (firstInteger == secondInteger && strArray[1].equals("==")){
            System.out.println("1");
        } else if (firstInteger >= secondInteger && strArray[1].equals(">=")){
            System.out.println("1");
        } else if (firstInteger <= secondInteger && strArray[1].equals("<=")){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
