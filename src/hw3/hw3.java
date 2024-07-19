package hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入不喜歡1到9:");
        int dislikeNumber = scanner.nextInt();
        System.out.println("可以選擇的號碼:");

        List<Integer> availableNumbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            if (!String.valueOf(i).contains(String.valueOf(dislikeNumber))) {
                availableNumbers.add(i);
            }
        }
        
        // Print the available numbers
        for (int num : availableNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Shuffle the list and pick the first 6 numbers
        Collections.shuffle(availableNumbers);
        System.out.println("隨機選出的6個號碼:");

        for (int i = 0; i < 6; i++) {
            System.out.print(availableNumbers.get(i) + " ");
        }
        
        scanner.close();
    }
}
