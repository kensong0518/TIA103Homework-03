package hw7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class hw2RandomNumbersToFile {

    public static void main(String[] args) {
        Random random = new Random();
        try (FileWriter writer = new FileWriter("Data.txt", true)) {
            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(1000) + 1;
                writer.write(number + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
