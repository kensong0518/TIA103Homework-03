package hw7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class hw1SampleFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 檔案名稱
        String fileName = "src\\\\hw7\\\\Sample.txt";

        // 讀取 Sample.txt 檔案內容
        try {
            File file = new File(fileName);

            // 確認檔案是否存在
            if (!file.exists()) {
                System.out.println("檔案不存在: " + fileName);
                return;
            }

            // 讀取檔案位元組
            long fileSizeInBytes = file.length();

            // 讀取檔案所有內容
            String content = new String(Files.readAllBytes(Paths.get(fileName)));

            // 計算字元數和行數
            int charCount = content.length();
            long lineCount = Files.lines(Paths.get(fileName)).count();

            // 輸出結果
            System.out.println(fileName + " 檔案共有 " + fileSizeInBytes + " 個位元組, " +
                               charCount + " 個字元, " +
                               lineCount + " 列資料");

        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤: " + e.getMessage());
        }

	}

}
