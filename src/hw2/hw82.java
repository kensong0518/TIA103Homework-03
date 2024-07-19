package hw2;

public class hw82 {

	public static void main(String[] args) {
		// 使用 for 迴圈來控制外層的九九乘法表行數
        for (int i = 1; i <= 9; i++) {
            // 使用 do-while 迴圈來打印每一行的乘法表運算式
            int j = 1;
            do {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
                j++;
            } while (j <= i);
            System.out.println();
        }

	}

}
