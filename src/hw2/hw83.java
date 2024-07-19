package hw2;

public class hw83 {

	public static void main(String[] args) {
		 int i = 1; // 外層迴圈控制乘法表的行數
	        while (i <= 9) {
	            int j = 1; // 內層迴圈控制每行的列數
	            do {
	                // 打印乘法表運算式及結果
	                System.out.printf(j + " * " + i + " = " + (i * j) + "\t");
	                j++;
	            } while (j <= 9); // 內層迴圈條件：列數不超過9
	            System.out.println(); // 換行，準備打印下一行乘法表
	            i++;
	        }

	}

}
