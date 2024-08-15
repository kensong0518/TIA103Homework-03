package hw4;

import java.util.Scanner;

public class DayOfYearCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入年份 (yyyy): ");
        int year = scanner.nextInt();

        System.out.print("請輸入月份 (mm): ");
        int month = scanner.nextInt();

        System.out.print("請輸入日期 (dd): ");
        int day = scanner.nextInt();

        // 檢查日期是否合法
        if (!isValidDate(year, month, day)) {
            System.out.println("輸入的日期不合法！");
            return;
        }

        // 計算該日期是該年的第幾天
        int dayOfYear = calculateDayOfYear(year, month, day);
        System.out.println("輸入的日期為該年第 " + dayOfYear + " 天");
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (month < 1 || month > 12) {
            return false;
        }

        // 各月的最大天數
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 如果是閏年，2月有29天
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        // 檢查日期是否在合法範圍內
        return day >= 1 && day <= daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int calculateDayOfYear(int year, int month, int day) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 如果是閏年，2月有29天
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        int dayOfYear = 0;

        // 累加前幾個月的天數
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }

        // 加上當月的天數
        dayOfYear += day;

        return dayOfYear;

	}

}
