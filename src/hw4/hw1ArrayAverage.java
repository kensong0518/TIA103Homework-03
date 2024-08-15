package hw4;

public class hw1ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};

        // 計算陣列的平均值
        double average = calculateAverage(numbers);
        System.out.println("陣列的平均值是: " + average);

        // 找出大於平均值的元素
        System.out.println("大於平均值的元素有: ");
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
    }

    public static double calculateAverage(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;

	}

}
