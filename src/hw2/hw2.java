package hw2;

public class hw2 {

	public static void main(String[] args) {
		 int product = 1; // 初始化乘積變數為 1
	        
	        // 使用 for 迴圈，從 1 開始，每次增加 1，直到 10
	        for (int i = 1; i <= 10; i++) {
	            product *= i; // 將當前的數字乘到乘積中
	        }
	        
	        // 輸出乘積
	        System.out.println("1～10的連乘積: " + product);
		

	}

}
