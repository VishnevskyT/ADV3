package exercise_2;

import java.io.*;

/**
 * Завдання 2
 * Створіть файл, запишіть у нього довільні дані та закрийте файл. Потім знову відкрийте цей файл, прочитайте дані і
 * виведіть їх на консоль.
 */
public class Main {

    public static void main(String[] args) {

        File file = new File("Main.txt");

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))){
            out.writeUTF(br.readLine());
           out.flush();
               System.err.println(in.readUTF());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
