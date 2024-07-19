package hw2;

public class hw5 {

	public static void main(String[] args) {
		int count = 0; // 記錄符合條件的數字個數
        // 遍歷1到49的所有數字
        for (int i = 1; i <= 49; i++) {
            // 如果數字不包含4
            if (!String.valueOf(i).contains("4")) {
            	//將變數 i 的值轉換為字串，並檢查字串中是否包含字符 '4'。
                System.out.print(i + " "); // 輸出該數字
                count++; // 計數加一
            }
        }
        // 換行
        System.out.println();
        // 輸出總共的數字個數
        System.out.println("總共有 " + count + " 個數字符合條件。");

	}

}
