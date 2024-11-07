import java.util.Scanner;

public class hw3DateFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("請輸入日期 (格式: yyyyMMdd，例如: 20110131): ");
            String input = scanner.nextLine();

            // 使用正規表示法檢查輸入是否為有效的日期格式
            if (!input.matches("\\d{8}")) {
                System.out.println("輸入無效，請輸入符合格式的日期 (yyyyMMdd)。");
                continue;
            }

            // 解析年、月、日
            String year = input.substring(0, 4);
            String month = input.substring(4, 6);
            String day = input.substring(6, 8);

            System.out.println("請選擇日期格式: ");
            System.out.println("(1) 年/月/日");
            System.out.println("(2) 月/日/年");
            System.out.println("(3) 日/月/年");
            System.out.print("選擇: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // 清除換行符

            // 顯示選定格式
            switch (choice) {
                case 1:
                    System.out.println("格式化日期: " + year + "/" + month + "/" + day);
                    break;
                case 2:
                    System.out.println("格式化日期: " + month + "/" + day + "/" + year);
                    break;
                case 3:
                    System.out.println("格式化日期: " + day + "/" + month + "/" + year);
                    break;
                default:
                    System.out.println("無效的選擇，請選擇 1、2 或 3。");
            }
            System.out.println(); // 空行分隔每次輸出
        }
    }
}
