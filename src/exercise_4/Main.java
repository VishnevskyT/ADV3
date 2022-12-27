package exercise_4;

import java.io.*;
import java.util.Scanner;

/**
 * Завдання 4
 * Створіть у пакеті текстовий файл і клас, внесіть у файл якийсь текст.
 * Виведіть на екран вміст файлу.
 */
public class Main {
    public static void main(String[] args) {

        try (FileWriter in = new FileWriter("C:\\Users\\LapTopUSA\\IdeaProjects\\ADV 3\\src\\exercise_4\\txt.txt");
             FileReader out = new FileReader("C:\\Users\\LapTopUSA\\IdeaProjects\\ADV 3\\src\\exercise_4\\txt.txt")) {

            Scanner scanner = new Scanner(System.in);
            System.err.print("Введіть що-небудь: _");
            in.write(scanner.nextLine());
            in.flush();

            int temp;
            while ((temp = out.read()) != -1) {
                System.out.print((char) temp);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
