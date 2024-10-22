//주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다.
//숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
//nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

import java.util.ArrayList;
import java.util.Iterator;

public class level1_Sosu {
    public static int solution(int[] nums) {
        ArrayList<Integer> set = new ArrayList<>();
        int answer = 0;
        int end = nums.length - 1;

        //3개의 수 합 리스트에 추가
        for (int i = end; i >= 2; i--) {
            for (int j = i - 1; j >= 1; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    set.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            int a = it.next();
            boolean chk = true;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) chk = false;
            }

            if (chk) {
                answer++;
                System.out.println("소수: " + a);
            }
            else{
                System.out.println(a + " : 소수가 아님");
            }
        }

        System.out.println("총 개수: " + answer);
        return answer;
    }

    public static void main(String[] args){

        int[] nums = { 1,2,7,6,4 };
        System.out.println(solution(nums));
    }
}
