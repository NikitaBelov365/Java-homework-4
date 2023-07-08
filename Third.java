import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Third {

    public static String Input_Num(int i, Scanner iScanner) {
        System.out.println("Input " + ++i + " number: ");
        String num = iScanner.next();
        return num;
    }

    public static double CalcFunc(int x, int y, String operation) {

        double z = 0;
        switch (operation) {
            case "+" -> z = x + y;
            case "-" -> z = x - y;
            case "*" -> z = x * y;
            case "/" -> z = x / y;
        }
        return z;
    }

    public static void Just_Write_To_File(int num1, int num2, double result, String operation) {
        try (FileWriter notation = new FileWriter("calk_log.txt", true)) {
            notation.append(num1 + " " + operation + " " + num2 + " = " + result);
            notation.append("\n");
            notation.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Input C to clean");
        int num1 = 0;
        int num2 = 0;
        String crutch = "";
        double result = 0;
        String operation = "";

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                num1 = Integer.parseInt(Input_Num(i, iScanner));
            } else if (i == 1) {
                crutch = Input_Num(i, iScanner);
                System.out.println(crutch);
                if (crutch.equals("C")) {
                    i = -1;
                    continue;
                } else {
                    num2 = Integer.parseInt(crutch);
                }
            } else {
                System.out.println("Input operation type (+, -, *, /): ");
                operation = iScanner.next();
                if (operation.equals("C")) {
                    i = 0;
                } else { 
                    result = CalcFunc(num1, num2, operation);
                }
            }
        }
        System.out.println(result);
        Just_Write_To_File(num1, num2, result, operation);
        iScanner.close();

    }
}
