package Seminar_3;

import java.util.Scanner;
public class InputTheString {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Немедленно ввелите вашу строку: ");
            String input = scanner.nextLine();
            stringInput(input);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void stringInput(String input) throws Exception {
        if (input.isEmpty()) {
            throw new Exception("Пустые строки вводить нельзя. До свидания!");
        }
        System.out.println("Да что ты говоришь!");
    }
}


