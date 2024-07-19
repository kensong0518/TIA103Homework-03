package hw2;

public class hw7 {

	public static void main(String[] args) {
		 // 定義要輸出的字母範圍
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F'};
        
        // 遍歷每個字母
        for (int i = 0; i < letters.length; i++) {
            // 根據當前的索引值 i，輸出 i+1 次該字母
            for (int j = 0; j <= i; j++) {
                System.out.print(letters[i]); // 輸出當前的字母
            }
            System.out.println(); // 換行
        }

	}

}
