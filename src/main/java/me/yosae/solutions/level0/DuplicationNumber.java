package me.yosae.solutions.level0;
import java.util.Arrays;



public class DuplicationNumber {
    public static int solution(int[] array, int n) {
        int answer = 0;
//n에 들어온 수가 array에 몇개가 있는지 count
        for(int num : array){
            if(num == n) answer++;
        }
        return answer;
    }

    public static int solutionArray(int[] array, int[] array2) {
        int answer = 0;

        answer = (int) Arrays.stream(array)
                .filter(n1 -> Arrays.stream(array2).anyMatch(n2 -> n1 == n2))
                .count();
        return answer;
    }
}
