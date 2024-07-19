package hw3;

import java.util.Scanner;

public class hw2_GuessNumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 隨機產生一個 0 到 100 的數字
        int Number = (int) (Math.random() * 101);

        System.out.println("猜一個 0 到 100 之間的數字：");

        while (true) { // 無窮迴圈，直到猜對為止
            int guess = scanner.nextInt(); // 讀取使用者的猜測數字

            // 檢查猜測的數字是否在範圍內
            if (guess < 0 || guess > 100) {
                System.out.println("請輸入一個 0 到 100 之間的數字！");
            } else if (guess < Number) {
                System.out.println("太小了"); // 提示太小
            } else if (guess > Number) {
                System.out.println("太大了"); // 提示太大
            } else {
                System.out.println("猜對了"); // 猜對，結束迴圈
                break;
            }
        }

        scanner.close(); // 關閉掃描器

    }

}
