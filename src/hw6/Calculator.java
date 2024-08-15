package hw6;

public class Calculator {
	// 計算 x 的 y 次方，並處理特殊情況
    public double powerXY(int x, int y) throws CalException {
        if (x == 0 && y == 0) {
            // 當 x 和 y 同時為 0 時，拋出自定義例外
            throw new CalException("0 的 0 次方未定義");
        }

        if (y < 0) {
            // 當 y 為負數時，計算 x 的 y 次方並處理結果為非整數的情況
            return 1.0 / powerXY(x, -y); // 負次方計算
        }

        // 計算 x 的 y 次方
        double result = 1.0;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
