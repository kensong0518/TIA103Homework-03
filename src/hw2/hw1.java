package hw2;

public class hw1 {

	public static void main(String[] args) {
		int sum = 0; // 初始化總和變數
        
        // 使用 for 迴圈，從 2 開始，每次增加 2，直到 1000
        for (int i = 2; i <= 1000; i += 2) {
            sum += i; // 將每個偶數加到總和中
        }
        
        // 輸出總和
        System.out.println("1～1000的偶數和: " + sum);
	}

}
