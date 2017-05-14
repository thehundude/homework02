package homework2;

public class CalculatorService {
    public static void calculate (int x, int y, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = x + y;
                System.out.println(result);
                break;
            case '-':
                result = x - y;
                System.out.println(result);
                break;
            case '*':
                result = x * y;
                System.out.println(result);
                break;
            case '/':
                result = x / y;
                System.out.println(result);
                break;
            default:
                System.out.println("Érvénytelen művelet.");
        }
    }
}
