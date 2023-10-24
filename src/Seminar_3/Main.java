package Seminar_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float number = readFloatFromUser();
        System.out.println("Вы ввели число: " + number);
    }

    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите дробное число: ");
            String input = scanner.nextLine();
            try {
                float number = Float.parseFloat(input);
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: неверный формат числа. Давайте еще раз");
            }

        }
    }
}


