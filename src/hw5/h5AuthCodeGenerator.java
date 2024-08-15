package hw5;

import java.util.Random;

public class h5AuthCodeGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String authCode = genAuthCode(); // 調用方法生成驗證碼
	        System.out.println("生成的驗證碼: " + authCode); // 打印驗證碼
	    }

	    // genAuthCode 方法生成8位數的驗證碼
	    public static String genAuthCode() {
	        Random rand = new Random(); // 創建Random對象
	        StringBuilder authCode = new StringBuilder(); // 使用StringBuilder拼接字符
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; // 定義字符集

	        for (int i = 0; i < 8; i++) { // 循環8次
	            int index = rand.nextInt(characters.length()); // 隨機選擇一個字符的索引
	            authCode.append(characters.charAt(index)); // 添加到驗證碼中
	        }

	        return authCode.toString(); // 返回生成的驗證碼

	}

}
