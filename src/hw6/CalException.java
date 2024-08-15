package hw6;

public class CalException extends Exception {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 建構子接收錯誤訊息
    public CalException(String message) {
        super(message);
    }

}
