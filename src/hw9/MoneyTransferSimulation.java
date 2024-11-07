package hw9;

class Account {
    private int balance = 0;

    // 存款方法
    public synchronized void deposit(int amount) {
        // 當餘額超過 3000 時停止匯款
        while (balance > 3000) {
            try {
                wait(); // 等待熊大提款
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // 設置中斷標誌
            }
        }
        balance += amount;
        System.out.println("媽媽存款 " + amount + " 元, 帳戶共有: " + balance + " ");
        notifyAll(); // 通知熊大可以提款
    }

    
    public synchronized void withdraw(int amount) {
      
        while (balance < amount) {
            try {
                wait(); // 等待媽媽匯款
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // 設置中斷標誌
            }
        }
        balance -= amount;
        System.out.println("熊大領了 " + amount + " 元, 帳戶共有: " + balance + " ");
        notifyAll(); // 
    }
}

class Mother implements Runnable {
    private final Account account;

    public Mother(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { // 匯款 10 次
            account.deposit(2000);
            try {
                Thread.sleep(500); // 模擬匯款間隔
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // 設置中斷標誌
            }
        }
    }
}

class BearWithdraw implements Runnable {
    private final Account account;

    public BearWithdraw(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { // 提款 10 次
            account.withdraw(1000);
            try {
                Thread.sleep(500); // 模擬提款間隔
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // 設置中斷標誌
            }
        }
    }
}

public class MoneyTransferSimulation {
    public static void main(String[] args) {
        Account account = new Account();

        Thread motherThread = new Thread(new Mother(account));
        Thread bearWithdrawThread = new Thread(new BearWithdraw(account));

        motherThread.start();
        bearWithdrawThread.start();

        // 等待兩個執行緒結束
        try {
            motherThread.join();
            bearWithdrawThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // 設置中斷標誌
        }

        System.out.println("匯款與提款結束！");
    }
}
