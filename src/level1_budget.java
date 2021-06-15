//부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때,
//최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.

import java.util.Arrays;
public class level1_budget {
    static int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for(int i=0;i<d.length;i++){

            if(budget >= d[i]){
                budget-=d[i];
                answer++;
            }
            else
                break;
        }
        return answer;
    }

    public static void main(String[] args){

        System.out.println(solution(new int[]{1, 3, 2, 5, 4},9));
        System.out.println(solution(new int[]{2,2,3,3},10));

    }

}
