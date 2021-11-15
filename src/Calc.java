import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int inputInt = getInput(s);
        System.out.println(inputInt);
    }
    public static int getInput(Scanner s) {
        System.out.println("Введите выражение типа [1 + 1]");
        int num1 = 0;
        int num2 = 0;
        String operation = null;
        try {
            num1 = s.nextInt();
            operation = s.next();
            num2 = s.nextInt();
            if (num1 > 10 || num1 < 0 || num2 > 10 || num2 < 0) {
                System.out.println("Числа больше 10 не вычисляю\nибо для меня это слишком сложно");
                System.exit(0);
            }
            if (operation.equals("+")) {
                System.out.println(num1 + num2);
            }
            if (operation.equals("-")) {
                System.out.println(num1 - num2);
            }
            if (operation.equals("*")) {
                System.out.println(num1 * num2);
            }
            if (operation.equals("/")) {
                System.out.println(num1 / num2);
            }
            else{
                System.exit(getInput(s));
            }
        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на круглик");
        }
        return getInput(s);
    }
}
