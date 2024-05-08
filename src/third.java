import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть три числа:");

        double number1, number2, number3;

        if (scanner.hasNextDouble()) {
            number1 = scanner.nextDouble();
        } else {
            System.out.println("Помилка: введено не дробове число.");
            scanner.close();
            return;
        }

        if (scanner.hasNextDouble()) {
            number2 = scanner.nextDouble();
        } else {
            System.out.println("Помилка: введено не дробове число.");
            scanner.close();
            return;
        }

        if (scanner.hasNextDouble()) {
            number3 = scanner.nextDouble();
        } else {
            System.out.println("Помилка: введено не дробове число.");
            scanner.close();
            return;
        }
    }
}

