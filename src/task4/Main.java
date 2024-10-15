package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Season seasons = new Season();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер месяца (1-12): ");
        int monthNumber = scanner.nextInt();

        seasons.getSeason(monthNumber);
    }
}
