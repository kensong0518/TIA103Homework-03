package hw2;

public class hw81 {

	public static void main(String[] args) {
		// 使用for迴圈和while迴圈打印99乘法表

        // for迴圈用於外層的乘數
        for (int i = 1; i <= 9; i++) {//控制乘數 i 的範圍，從 1 到 9
            int j = 1;
            // while迴圈用於內層的被乘數
            while (j <= i) {//控制被乘數 j 的範圍，從 1 到 i
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
                j++;
            }
            System.out.println(); // 每一行結束後換行
        }

	}

}
