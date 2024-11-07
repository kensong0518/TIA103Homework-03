package hw10;
import java.text.DecimalFormat;
import java.util.Scanner;

public class hw2TestFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueChoice;  // 用來判斷是否繼續
        
        do {
            System.out.print("請輸入一個數字: ");
            String input = scanner.nextLine();

            // 檢查是否為數字格式
            if (!input.matches("-?\\d+(\\.\\d+)?")) {  // 判斷是否為數字格式 (支援負數和小數)
                System.out.println("輸入無效，請輸入一個有效的數字。");
            } else {
                double number = Double.parseDouble(input);

                System.out.println("請選擇顯示格式: ");
                System.out.println("(1) 千分位");
                System.out.println("(2) 百分比");
                System.out.println("(3) 科學記號");
                System.out.print("選擇: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // 清除換行符

                switch (choice) {
                    case 1:
                        // 千分位格式
                        DecimalFormat thousandFormat = new DecimalFormat("#,###");
                        System.out.println("千分位格式: " + thousandFormat.format(number));
                        break;
                    case 2:
                        // 百分比格式
                        DecimalFormat percentFormat = new DecimalFormat("#%");
                        System.out.println("百分比格式: " + percentFormat.format(number));
                        break;
                    case 3:
                        // 科學記號格式
                        DecimalFormat scientificFormat = new DecimalFormat("0.###E0");
                        System.out.println("科學記號格式: " + scientificFormat.format(number));
                        break;
                    default:
                        System.out.println("無效的選擇，請選擇 1、2 或 3。");
                }
            }

            // 詢問是否繼續
            System.out.print("是否要再次執行？(y/n): ");
            continueChoice = scanner.nextLine();

        } while (continueChoice.equalsIgnoreCase("y"));

        System.out.println("程式結束。");
        scanner.close();
    }
}
