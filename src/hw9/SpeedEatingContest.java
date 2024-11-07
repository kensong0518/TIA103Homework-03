package hw9;

import java.util.Random;

class ContestantRunnable implements Runnable {
    private String name;
    private int bowls;
    private Random random = new Random();
    private static volatile boolean winnerDeclared = false; // 紀錄是否已有優勝者

    public ContestantRunnable(String name, int bowls) {
        this.name = name;
        this.bowls = bowls;
    }

    @Override
    public void run() {
        for (int i = 1; i <= bowls; i++) {
            try {
                if (i == 1) {
                    System.out.println(name + " 吃第一碗飯！");
                } else {
                    System.out.println(name + " 吃第 " + i + " 碗飯！");
                }
                int sleepTime = 500 + random.nextInt(2501); // 500 到 3000 毫秒的隨機延遲
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                System.out.println(name + " 中止比賽！");
                return;
            }
        }
        
        // 若尚未宣告優勝者，則該參賽者為優勝者
        if (!winnerDeclared) {
            winnerDeclared = true;
            System.out.println(name + " 率先完成了比賽！");
        } else {
            System.out.println(name + " 完成了比賽！");
        }
    }
}

public class SpeedEatingContest {
    public static void main(String[] args) {
        int bowls = 10;

      
        Thread contestant1 = new Thread(new ContestantRunnable("饅頭人", bowls));
        Thread contestant2 = new Thread(new ContestantRunnable("詹姆士", bowls));

        System.out.println("大胃王快食比賽開始！");

      
        contestant1.start();
        contestant2.start();

        try {
            contestant1.join();
            contestant2.join();
        } catch (InterruptedException e) {
            System.out.println("比賽被中斷！");
        }

        System.out.println("大胃王快食比賽結束！");
    }
}
