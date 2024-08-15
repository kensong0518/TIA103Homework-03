package hw5;

public class h41MyRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 使用無參數建構子建立物件
        MyRectangle rect1 = new MyRectangle();
        rect1.setWidth(10); // 設置寬度為10
        rect1.setDepth(20); // 設置深度為20
        System.out.println("長方形1的面積: " + rect1.getArea()); // 打印面積

        // 使用帶參數建構子建立物件
        MyRectangle rect2 = new MyRectangle();
        System.out.println("長方形2的面積: " + rect2.getArea()); // 打印面積

	}

}
