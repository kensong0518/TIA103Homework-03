package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      // 建立 Collection 物件
        Collection<Object> collection = new ArrayList<>();

        // 加入資料
        collection.add(100);               // Integer
        collection.add(3.14);              // Double
        collection.add(21L);               // Long
        collection.add(Short.valueOf("100"));  // Short
        collection.add(5.1);               // Double
        collection.add("Kitty");           // String
        collection.add(100);               // Integer
        collection.add(new Object());      // Object
        collection.add("Snoopy");          // String
        collection.add(new BigInteger("1000")); // BigInteger

        // 印出所有元素 (Iterator)
        System.out.println("使用 Iterator 印出集合內的所有元素:");
        Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 印出所有元素 (傳統 for)
        System.out.println("\n使用傳統 for 印出集合內的所有元素:");
        for (int i = 0; i < ((ArrayList<Object>) collection).size(); i++) {
            System.out.println(((ArrayList<Object>) collection).get(i));
        }

        // 印出所有元素 (foreach)
        System.out.println("\n使用 foreach 印出集合內的所有元素:");
        for (Object obj : collection) {
            System.out.println(obj);
        }

        // 移除非 Number 相關的物件
        collection.removeIf(obj -> !(obj instanceof Number));

        // 再次印出集合內的所有元素
        System.out.println("\n移除非 Number 相關的物件後的集合元素:");
        for (Object obj : collection) {
            System.out.println(obj);
        }

	}

}
