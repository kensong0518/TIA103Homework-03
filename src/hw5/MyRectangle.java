package hw5;

public class MyRectangle {
	private double width; // 定義私有屬性width
    private double depth; // 定義私有屬性depth

    // 無參數建構子
    public MyRectangle() {
        this.width = 0; // 初始化width為0
        this.depth = 0; // 初始化depth為0
    }

    // 帶參數建構子
    public MyRectangle(double width, double depth) {
        this.width = width; // 設置width為傳入的參數
        this.depth = depth; // 設置depth為傳入的參數
    }

    // 設定寬度
    public void setWidth(double width) {
        this.width = width; // 將傳入的參數指定給width屬性
    }

    // 設定深度
    public void setDepth(double depth) {
        this.depth = depth; // 將傳入的參數指定給depth屬性
    }

    // 獲取面積
    public double getArea() {
        return this.width * this.depth; // 返回長方形的面積
    }

}
