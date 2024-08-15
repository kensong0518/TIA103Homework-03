package hw6;

import java.util.Scanner;

public class h1CalTest {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			Calculator calculator = new Calculator();

			System.out.println("計算 x 的 y 次方");
			
			// 讀取 x 和 y 的值
			System.out.print("請輸入 x 的值: ");
			int x = scanner.nextInt();
			
			System.out.print("請輸入 y 的值: ");
			int y = scanner.nextInt();

			try {
			    // 調用 powerXY 方法，並顯示計算結果
			    double result = calculator.powerXY(x, y);
			    System.out.println(x + " 的 " + y + " 次方是: " + result);
			} catch (CalException e) {
			    // 捕捉並處理 CalException，顯示錯誤訊息
			    System.out.println("錯誤: " + e.getMessage());
			} catch (Exception e) {
			    // 捕捉並處理其他未知的例外
			    System.out.println("未知的錯誤: " + e.getMessage());
			}
		}
	}

}
