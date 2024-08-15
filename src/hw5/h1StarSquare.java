package hw5;

import java.util.Scanner;

public class h1StarSquare {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			// 提示用戶輸入寬度和高度
			System.out.print("請輸入矩形的寬: ");
			int width = scanner.nextInt(); // 讀取寬度
			System.out.print("請輸入矩形的高: ");
			int height = scanner.nextInt(); // 讀取高度

			// 打印星號矩形
			starSquare(width, height);
		}
    }

    // starSquare 方法打印一個星號矩形
    public static void starSquare(int width, int height) {
        // 使用兩個循環控制星號的打印
        for (int i = 0; i < height; i++) { // 外層循環控制行數
            for (int j = 0; j < width; j++) { // 內層循環控制每行的星號數
                System.out.print("*"); // 打印星號
            }
            System.out.println(); // 每行打印完畢後換行
        }
	}

}
