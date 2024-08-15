package hw5;

public class h3MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定義整數二維陣列
        int[][] intArray = {
            {3, 5, 7},
            {2, 8, 6},
            {1, 4, 9}
        };

        // 定義浮點數二維陣列
        double[][] doubleArray = {
            {2.5, 3.8, 4.7},
            {1.2, 9.6, 2.3},
            {4.8, 7.3, 6.1}
        };

        // 調用maxElement方法並打印結果
        System.out.println("整數陣列的最大值: " + maxElement(intArray));
        System.out.println("浮點數陣列的最大值: " + maxElement(doubleArray));
    }

    // maxElement方法返回整數二維陣列的最大值
    public static int maxElement(int x[][]) {
        int max = Integer.MIN_VALUE; // 設置最大值為最小整數值
        for (int[] row : x) { // 遍歷每一行
            for (int num : row) { // 遍歷每一列
                if (num > max) { // 如果當前值大於最大值
                    max = num; // 更新最大值
                }
            }
        }
        return max; // 返回最大值
    }

    // maxElement方法返回浮點數二維陣列的最大值
    public static double maxElement(double x[][]) {
        double max = Double.MIN_VALUE; // 設置最大值為最小浮點數值
        for (double[] row : x) { // 遍歷每一行
            for (double num : row) { // 遍歷每一列
                if (num > max) { // 如果當前值大於最大值
                    max = num; // 更新最大值
                }
            }
        }
        return max; // 返回最大值

	}

}
