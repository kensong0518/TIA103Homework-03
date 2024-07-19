package hw1;

public class hw3 {
	 public static void main(String[] args) {
	        int a = 256559;
	        
	        int days = a / 86400;//60*60*24
	        int hours = (a % 86400) / 3600;//用%餘的方式，扣除掉天的秒數，除以1小時有60*60幾秒，商就是小時
	        int minutes = (a % 3600) / 60;//a % 3600得到移除整小時後的剩餘秒數,60是一分鐘的秒數
	        int seconds = a % 60;
	        System.out.println(days + "天, " + hours + "小时, " + minutes + "分鐘, " + seconds + "秒.");
	    }
}
