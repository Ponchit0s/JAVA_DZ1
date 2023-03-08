import java.util.Scanner;

/*Реализовать простой калькулятор*/
public class Task3 {
    public static void main(String[] args) {
        System.out.print("Число 1: ");
        double a = userInputNumb();
        System.out.print("Укажите арифметическую операцию: ");
        char arithmeticalOperation = userInputArithmeticalOperation();
        System.out.print("Число 2: ");
        double b = userInputNumb();

        double result = 0;
        String resultError = null;

        if (arithmeticalOperation == '+') {
            result = addition(a, b);
        } else if (arithmeticalOperation == '-') {
            result = subtraction(a, b);
        } else if (arithmeticalOperation == '*') {
            result = multiplication(a, b);
        } else {
            if (b == 0) {
                resultError = "На нуль делить нельзя!";
            } else {
                result = division(a, b);
            }
            ;
        }

        if (arithmeticalOperation == '/' && b == 0) {
            System.out.println(resultError);
        } else {
            System.out.println(result);
        }

    }

    static double userInputNumb() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextDouble()) {
                double userNumb = sc.nextDouble();
                return userNumb;
            }
            System.out.println("Ошибка ввода! Попробуйте еще раз");
        }
    }

    static char userInputArithmeticalOperation() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            char userOperation = sc.nextLine().charAt(0);
            if (userOperation == '+' || userOperation == '-' || userOperation == '*' || userOperation == '/') {
                return userOperation;
            }
            System.out.println("Ошибка ввода! Попробуйте еще раз");
        }
    }

    static double addition(double x, double y) {
        return x + y;
    }

    static double subtraction(double x, double y) {
        return x - y;
    }

    static double multiplication(double x, double y) {
        return x * y;
    }

    static double division(double x, double y) {
        return x / y;
    }
}
