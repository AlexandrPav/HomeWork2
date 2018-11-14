//В переменной n хранится 2ух значное число.
// Создайте метод выводящий и вычисляющий на экран сумму цифр n
public class BlocktwoOne {
    public static void main(String[] args) {
        int n = 27;
        int a = n % 10;
        int b = (n / 10) % 10;
        System.out.println(" Сумма цифр " + n + " равна " + (a + b));
    }
}
