import java.util.Scanner;

public class RandomTickets {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 10, чтобы получить билет: ");
        Scanner scanner = new Scanner(System.in);
        var counter = scanner.nextInt();
        System.out.println("Вы ввели число: " +counter +" Вот ваши билет!");



    }
}
