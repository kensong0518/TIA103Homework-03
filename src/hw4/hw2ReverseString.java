package hw4;

public class hw2ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
        String reversedString = reverse(s);
        System.out.println("反轉後的字串是: " + reversedString);
    }

    public static String reverse(String input) {
        char[] charArray = input.toCharArray();
        StringBuilder reversed = new StringBuilder();
        
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed.append(charArray[i]);
        }

        return reversed.toString();

	}

}
