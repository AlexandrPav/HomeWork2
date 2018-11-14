//Ввести с консоли n целых чисел. На консоль вывести:
//        1. Четные и нечетные числа.
//        2. Наибольшее и наименьшее число.
//        3. Числа, которые делятся на 3 или на 9.
//        4. Числа, которые делятся на 5 и на 7.
//        5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
//        6. Наибольший общий делитель и наименьшее общее кратное этих чисел.

import java.util.Scanner;

public class Blockthree {
    public static void main(String[] args) {
        System.out.println(" Введите количество чисел ");
        Scanner scanner = new Scanner(System.in);
        int razm = scanner.nextInt();
        int[] numbers = new int[razm];
        System.out.println(" Введите целые числа через пробел ");
        for (int i = 0; i < razm; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < razm; i++) {
            if (numbers[i] % 2 != 0)
                System.out.println(" Нечетные числа " + numbers[i]);
            else if (numbers[i] % 2 == 0)
                System.out.println(" Четные числа " + numbers[i]);
        }
        for (int i = 0; i < razm; i++) {
            if ((numbers[i] % 3 == 0) || (numbers[i] % 9 == 0))
                System.out.println(" Число которое делится на 3 или 9 " + numbers[i]);
        }

        for (int i = 0; i < razm; i++) {
            if ((numbers[i] % 5 == 0) && (numbers[i] % 7 == 0))
                System.out.println(" Числа которые делятся на 5 и 7 " + numbers[i]);
        }
        int min = numbers[0];
        for (int i = 0; i < razm; i++) {
            if (min > numbers[i])
                min = numbers[i];
        }
        System.out.println(" Наименьшее число " + min);

        int max = numbers[0];
        for (int i = 0; i < razm; i++) {
            if (max < numbers[i])
                max = numbers[i];
        }
        System.out.println(" Набольшее число " + max);
    }

}
