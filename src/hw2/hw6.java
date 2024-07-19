package hw2;

public class hw6 {
	public static void main(String[] args) {
		 // 最外層循環控制行數
        for (int i = 10; i >= 1; i--) {//從10開始，每次減少1，控制行數
            // 內層循環控制每行的數字
            for (int j = 1; j <= i; j++) {
            	//從1開始，每次增加1，並且根據外層循環的變量來決定每行的輸出數字
                System.out.print(j + " ");
            }
            // 每行結束後換行
            System.out.println();
        }
    }
}

