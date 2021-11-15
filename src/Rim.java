import java.util.InputMismatchException;
import java.util.Scanner;

public class Rim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        girPut(sc);
    }

    public static int girPut(Scanner sc) {
        int z, x;
        char operation = 0;
        int result;
        System.out.println("Введите выражение [V+V] от I до X");
        String gitHub = sc.nextLine();
        char[] gpamo = new char[9];
        for (int i = 0; i < gitHub.length(); i++) {
                gpamo[i] = gitHub.charAt(i);
                if (gpamo[i] == '+') {
                    operation = '+';
                }
                if (gpamo[i] == '-') {
                    operation = '-';
                }
                if (gpamo[i] == '*') {
                    operation = '*';
                }
                if (gpamo[i] == '/') {
                        operation = '/';
                    }
                }



        String under_charString = String.valueOf(gpamo);
        String[] blacks = under_charString.split("[+-/*]");
        String stable00 = blacks[0];
        String stable01 = blacks[1];
        String string03 = stable01.trim();
        z = testRim(stable00);
        x = testRim(string03);
        if (z < 0 || x < 0) {
        } else {
            result = test(z, x, operation);
            String result1 = converter(result);
            System.out.println(result1);
        }
        return girPut(sc);
    }


    public static int testRim(String gp) {
        try {
            if (gp.equals("I")) {
                return 1;
            } else if (gp.equals("II")) {
                return 2;
            } else if (gp.equals("III")) {
                return 3;
            } else if (gp.equals("IV")) {
                return 4;
            } else if (gp.equals("V")) {
                return 5;
            } else if (gp.equals("VI")) {
                return 6;
            } else if (gp.equals("VII")) {
                return 7;
            } else if (gp.equals("VIII")) {
                return 8;
            } else if (gp.equals("IX")) {
                return 9;
            } else if (gp.equals("X")) {
                return 10;
            }
        } catch (InputMismatchException e) {
            System.out.println("Неверный формат данных");
        }
        return -1;
    }

    public static int test(int num1, int num2, char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        return result;
    }


    public static String converter(int numRum) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        final String s = roman[numRum];
        return s;
    }
}

