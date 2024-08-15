package hw4;

public class hw5ExamScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 每次考試的成績，二維陣列（考試為行）
        int[][] scores = {
            {10, 35, 40, 100, 90, 85, 75, 70}, // 考試1
            {37, 75, 77, 89, 64, 75, 70, 95}, // 考試2
            {100, 70, 79, 90, 75, 70, 79, 90}, // 考試3
            {77, 95, 70, 89, 60, 75, 85, 89}, // 考試4
            {98, 70, 89, 90, 75, 90, 89, 90}, // 考試5
            {90, 80, 100, 75, 50, 20, 99, 75}  // 考試6
        };

        // 用來記錄每位同學取得最高分的次數
        int[] maxScoresCount = new int[8]; // 8位同學

        // 計算每次考試的最高分數
        for (int exam = 0; exam < scores.length; exam++) { // 外層迴圈遍歷每次考試
            int maxScore = 0;
            int maxStudent = -1;

            // 找出這次考試的最高分
            for (int student = 0; student < scores[exam].length; student++) { // 內層迴圈遍歷每位同學
                if (scores[exam][student] > maxScore) {
                    maxScore = scores[exam][student];
                    maxStudent = student;
                }
            }

            // 增加取得最高分的同學的計數
            if (maxStudent != -1) {
                maxScoresCount[maxStudent]++;
            }
        }

        // 顯示結果
        for (int student = 0; student < maxScoresCount.length; student++) {
            System.out.println("學號 " + (student + 1) + " 在考試中取得最高分的次數: " + maxScoresCount[student]);
        }
	}

}
