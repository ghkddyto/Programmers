import java.util.Arrays;

public class level1_Xincrease {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=1; i<=n; i++)
            answer[i-1] = (long)i*x;

        return answer;
    }

    public static void main(String[] args){

        level1_Xincrease test = new level1_Xincrease();
        System.out.println(Arrays.toString(test.solution(2,5)));
    }
}
