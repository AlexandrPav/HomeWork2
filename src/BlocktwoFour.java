//В переменных q и w хранятся 2 натуральных числа. Создайте программу,
// выводящию результат деления q на w с остатком.
public class BlocktwoFour {
    public static void main(String[] args) {
        int q = 21;
        int w = 8;
        int a = q % w;
        System.out.println(q / w + " и " + a + " в остатке ");
    }
}
