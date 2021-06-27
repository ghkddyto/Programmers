//두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수,
//solution을 완성해 보세요. 배열의 맨 앞에 최대공약수,
//그다음 최소공배수를 넣어 반환하면 됩니다.
//예를 들어 두 수 3, 12의 최대공약수는 3,
// 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

import java.util.Arrays;

public class level1_MaxMin {
    static int[] solution(int n, int m) {
        int[] answer = {Math.max(n,m),Math.min(n,m)};
        while(answer[1] != 0){
            int tmp = answer[0] % answer[1];
            answer[0] = answer[1]; //최소공약수
            answer[1] = tmp;
        }
        answer[1] = n*m/answer[0]; //최소공배수
        return answer;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(3,12)));
        System.out.println(Arrays.toString(solution(1,10)));

    }
}
