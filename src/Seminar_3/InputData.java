package Seminar_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InputData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your data in the following format: " +
                "\nSurname Name Patronymic BirthDate(dd.mm.yyyy) PhoneNumber(000) sex(m/f)");
        String input = scanner.nextLine();
        String[] data = input.split(" ");

        if (data.length != 6) {
            System.out.println("Error -1 : wrong amount of parameters");
            return;
        }

        String surname = data[0];
        String name = data[1];
        String patronymic = data[2];
        String birthDate = data[3];
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        try {
            Date date = dateFormat.parse(birthDate);
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Wrong date format");
            return;
        }
        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(data[4]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Wrong telephone number format");
            return;
        }
        char gender;
        if (data[5].length() != 1 || !(data[5].equals("f") || data[5].equals("m"))) {
            System.out.println("Error: wrong sex format");
            return;
        } else {
            gender = data[5].charAt(0);
        }

        try {
            FileWriter writer = new FileWriter(surname + ".txt", true);
            writer.write(surname + name + patronymic + birthDate + " " + phoneNumber + gender + "\n");
            writer.close();
            System.out.println("Data saved to file successfully " + surname + ".txt");
        } catch (IOException e) {
            System.out.println("Writing to file failed!:");
            e.printStackTrace();
        }
    }
}