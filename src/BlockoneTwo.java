//Создать метод который будет считать и выводить значение по формуле a = 4*(b+c-1) / 3
//        b и c вводит пользователь

import java.util.Scanner;

public class BlockoneTwo {
    private float b;
    private float c;

    public BlockoneTwo() {
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите b");
        float b = scanner.nextFloat();
        System.out.println("Введите c");
        float c = scanner.nextFloat();
        System.out.println("a = " + (4 * (b + c - 1) / 3));
    }
}
