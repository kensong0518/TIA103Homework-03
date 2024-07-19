package hw1;

public class hw5 {
	
	public static void main(String[] args) {
	    double a = 1500000;
	    double b = 0.02;
	    int years = 10;
	    
	    double amount = a * Math.pow((1 + b), years);
//	    計算過程
//	    (1 + b)：表示每個時間周期內的增長因子。
//	    Math.pow((1 + b), years)：計算增長因子 (1 + b) 的 years 次方。
//	    a * Math.pow((1 + b), years)：表示初始金額 a 經過 years 年，以增長率 b 進行複利增長後的最終金額。

	    
	    System.out.println("總金額: " + amount);
	}

}
