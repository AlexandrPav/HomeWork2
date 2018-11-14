//В переменной n хранится 3ех значное число.
// Создайте метод выводящий и вычисляющий на экран сумму цифр n
public class BlocktwoTwo {
    public static void main(String[] args) {
        int n = 351;
        int a = n % 10;
        int b = (n / 10) % 10;
        int c = (n / 100) % 10;
        System.out.println(" Сумма цифр " + n + " равна " + (a + b + c));
    }

}
