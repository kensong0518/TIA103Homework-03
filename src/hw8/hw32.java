package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class hw32 {
    public static void main(String[] args) {
        List<Train> trainList = new ArrayList<>();
        
        // 建立 Train 物件並加入 ArrayList
        trainList.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
        trainList.add(new Train(118, "自強", "高雄", "台北", 500));
        trainList.add(new Train(1288, "區間", "新竹", "基隆", 400));
        trainList.add(new Train(122, "自強", "台中", "花蓮", 600));
        trainList.add(new Train(1222, "區間", "樹林", "七堵", 300));

        // 使用 Comparator 進行排序，按 number 從大到小排序
        Collections.sort(trainList, new Comparator<Train>() {
            @Override
            public int compare(Train t1, Train t2) {
                return Integer.compare(t2.getNumber(), t1.getNumber()); // 從大到小排序
            }
        });

        // 印出按班次編號由大到小排序的 Train 物件
        System.out.println("按班次編號由大到小排序:");
        for (Train train : trainList) {
            System.out.println(train);
        }
    }
}
