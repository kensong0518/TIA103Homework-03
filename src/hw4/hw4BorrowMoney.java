package hw4;

import java.util.Scanner;

public class hw4BorrowMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 員工編號與現金情況
        int[] employeeIds = {25, 32, 8, 19, 27};
        int[] cashOnHand = {2500, 800, 500, 1000, 1200};

        // 讀取用戶輸入的借款金額
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入欲借的金額: ");
        int amountToBorrow = scanner.nextInt();

        // 紀錄有錢可借的員工
        StringBuilder availableEmployees = new StringBuilder();
        int count = 0;

        // 遍歷陣列檢查誰有足夠的錢借出
        for (int i = 0; i < cashOnHand.length; i++) {
            if (cashOnHand[i] >= amountToBorrow) {
                availableEmployees.append(employeeIds[i]).append(" ");
                count++;
            }
        }

        // 輸出結果
        if (count > 0) {
            System.out.println("有錢可借的員工編號: " + availableEmployees + "共 " + count + " 人!");
        } else {
            System.out.println("很抱歉，沒有同事有足夠的錢可借。");
        }

	}

}
