import java.util.ArrayList;

/*Вывести все простые числа от 1 до 1000*/
public class Task2 {
    public static void main(String[] args) {
        /*int[] arr = new int[1000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }*/
        int range = 1000;

        for (int i = 0; i < range; i++) {
            if (searchPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean searchPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
