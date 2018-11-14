import java.util.Scanner;

//Создать метод hello, который будет приветствовать кого угодно, в зависимости от пожелания пользователя
public class BlockoneOne {
    public static void main(String[] args) {
        Hello();
    }

    public static void Hello() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя ");
        String name = String.valueOf(scanner.next());
        System.out.println("Приветствую " + name);

    }
}
