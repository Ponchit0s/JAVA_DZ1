/*
 *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
 *  заменены знаком вопроса,например 2? + ?5 = 69. Требуется восстановить выражение
 *до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        String equation = "2? + ?5 = 69";
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        String numberOne = sc.nextLine();
        System.out.println("");
        String numberTwo = sc.nextLine();
        sc.close();

/*        int x1 = 20;
        int x2;
        int y1;
        int y2 = 5;
        int z1 = 60;
        int z2 = 9;
        if (z2 < y2) {
            z1 -= 10;
            z2 += 10;
        }

        x2 = z2 - y2;
        y1 = z1 - x1;

        int x = x1 + x2;
        int y = y1 + y2;
        int z = z1 + z2;*/

        System.out.println();
    }

    static int inventorToInteger(String numb) {
        int knownNumb;
        for (int i = 0; i < numb.length(); i++) {
            if (Character.isDigit(numb.charAt(i))) {
                if (i == 0) {
                    knownNumb = (int)numb.charAt(i) * 10;
                } else {
                    knownNumb = (int)numb.charAt(i);
                }
            }

        }
        return 0;
    }

    /*static int userInputNumb() {
        System.out.print("Введите уравнение для восстановления слогаемых: ");

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
    }*/
}
