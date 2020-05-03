public class Calc {

    public static int getResult(String operator, int a, int b) {
        int result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
            case "*":
                result = a * b;
            case "/":
                result = a / b;
            default:
                System.out.println("Thank you!");
        }
        return result;
    }
}
