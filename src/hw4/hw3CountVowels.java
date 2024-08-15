package hw4;

public class hw3CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        int vowelCount = countVowels(planets);
        System.out.println("字串陣列中共有 " + vowelCount + " 個母音。");
    }

    public static int countVowels(String[] array) {
        int count = 0;
        for (String word : array) {
            count += countVowelsInWord(word);
        }
        return count;
    }

    public static int countVowelsInWord(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(Character.toLowerCase(c)) != -1;

	}

}
