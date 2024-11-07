package hw10;
import java.util.Random;

public class hw1PrimeNumberChecker {
    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println("生成的隨機數字與質數判斷：");
        for (int i = 0; i < 5; i++) {
            int number = 1 + random.nextInt(100);
            System.out.println(number + (isPrime(number) ? " 是質數" : " 不是質數"));
        }
    }
    
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false; 
        if (num == 2) return true;
        if (num % 2 == 0) return false; 

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
