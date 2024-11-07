package hw3;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

class Train {
    private int number;        
    private String type;       
    private String start;      
    private String dest;       
    private double price;      

    public Train(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return number == train.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", start='" + start + '\'' +
                ", dest='" + dest + '\'' +
                ", price=" + price +
                '}';
    }
}

public class hw31 {
    public static void main(String[] args) {
        Set<Train> trainSet = new HashSet<>();
        
        // 建立 Train 物件並加入 HashSet
        trainSet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
        trainSet.add(new Train(118, "自強", "高雄", "台北", 500));
        trainSet.add(new Train(1288, "區間", "新竹", "基隆", 400));
        trainSet.add(new Train(122, "自強", "台中", "花蓮", 600));
        trainSet.add(new Train(1222, "區間", "樹林", "七堵", 300));
        trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700)); // 重複的物件

        // 印出不重複的 Train 物件
        System.out.println("不重複的 Train 物件:");
        for (Train train : trainSet) {
            System.out.println(train);
        }
    }
}
