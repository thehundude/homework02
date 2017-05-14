package homework2;

import java.util.Scanner;

public class CalculationHelper {
    public static void userInput() {
        int x, y;
        String operationString;

        Scanner reader = new Scanner(System.in);
        System.out.println("Írd be az első számot:");
        x = reader.nextInt();
        System.out.println("Írd be a második számot:");
        y = reader.nextInt();
        System.out.println("Írd be a művelet jelét:");
        operationString = reader.next();

        if (operationString.length() > 1) {
            System.out.println("Érvénytelen művelet");
            return;
        }

        CalculatorService.calculate(x, y, operationString.charAt(0));
    }
}
