import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку в формате a х b, где х - арифметическая операция: ");

        String toCalc = scanner.nextLine();

        System.out.println("Результат: " + Calc.calc(toCalc));

    }
}
