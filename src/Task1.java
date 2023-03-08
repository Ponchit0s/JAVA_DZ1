//Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int numberN = userInputNumb();
        int factorialOfNumber = findingFactorialOfNumber(numberN);
        int sumOfSum = findingSumOfNumber(numberN);
        System.out.printf("Факториал числа %d равен:\n%d! = %d.", numberN, numberN, factorialOfNumber);
        System.out.printf("\nn-ое треугольное число %d равен: %d.", numberN, sumOfSum);
    }

    static int userInputNumb() {
        System.out.print("Введите целое положительно число: ");

        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                int userNumb = sc.nextInt();
                if (userNumb >= 0) {
                    sc.close();
                    return userNumb;
                }
            }
            System.out.println("Ошибка ввода! Попробуйте еще раз");
        }
    }

    static int findingFactorialOfNumber(int numberForFactorial) {
        if (numberForFactorial <= 1) {
            return 1;
        } else {
            return numberForFactorial * findingFactorialOfNumber(numberForFactorial - 1);
        }
    }

    static int findingSumOfNumber(int numberForSum) {
        if (numberForSum <= 1) {
            return 1;
        } else {
            return numberForSum + findingSumOfNumber(numberForSum - 1);
        }
    }
}
