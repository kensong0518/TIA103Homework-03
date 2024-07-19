package hw3;

import java.util.Scanner;

public class hw1_SimpleTriangleType {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 請使用者輸入三個數字
        System.out.println("請輸入三個數字：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // 判斷是否為三角形
        if (isTriangle(a, b, c)) {
            // 判斷三角形的類型
            if (a == b && b == c) {
                System.out.println("正三角形"); // 所有邊相等
            } else if (a == b || b == c || a == c) {
                System.out.println("等腰三角形"); // 兩邊相等
            } else if (isRightTriangle(a, b, c)) {
                System.out.println("直角三角形"); // 符合勾股定理
            } else {
                System.out.println("其它三角形"); // 其他類型的三角形
            }
        } else {
            System.out.println("不是三角形"); // 不符合三角形條件
        }

        scanner.close(); // 關閉掃描器
    }

    // 判斷是否為三角形
    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    // 判斷是否為直角三角形
    public static boolean isRightTriangle(int a, int b, int c) {
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);

	}

}

