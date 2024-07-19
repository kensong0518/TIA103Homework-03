package hw2;

public class hw3 {

	public static void main(String[] args) {
		int product = 1; // 初始化乘積變數為 1
        int i = 1; // 初始化迴圈控制變數
        
        // 使用 while 迴圈，當 i 小於等於 10 時執行
        while (i <= 10) {
            product *= i; // 將當前的數字乘到乘積中
            i++; // 將 i 增加 1
        }
        
        // 輸出乘積
        System.out.println("1～10: " + product);

	}

}
