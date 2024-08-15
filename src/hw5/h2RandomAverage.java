package hw5;

import java.util.Random;

public class h2RandomAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 randAvg(); // 調用方法
    }

    // randAvg 方法生成隨機數並計算平均值
    public static void randAvg() {
        Random rand = new Random(); // 創建一個Random對象
        int[] numbers = new int[10]; // 數組用來存儲10個隨機數
        int sum = 0; // 用來計算總和

        System.out.print("生成的隨機數: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(101); // 生成0到100之間的隨機數
            sum += numbers[i]; // 累加到總和
            System.out.print(numbers[i] + " "); // 打印每個隨機數
        }

        // 計算平均值
        double average = (double) sum / numbers.length; // 強制類型轉換以獲得精確結果
        System.out.println("\n平均值: " + average); // 打印平均值

	}

}
