package me.yosae.solutions.level2;//124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.
//124 나라에는 자연수만 존재합니다.
//124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다..

//입출력 예
//n	result
//1	1
//2	2
//3	4
//4	11

import java.util.Arrays;
import java.util.Stack;

class level2_124Number {
    static String solution(int n) {
        String answer = "";
        Stack<Integer> st = new Stack<>();
        int tmp = 0;
        
        while(n>0){
            if(n%3==0) {
                st.push(4);
                n = n/3-1;
            }
            else{
                st.push(n%3);
                n /= 3;
            }
        }
        while(!st.empty()){
            tmp = st.pop();
            answer += Integer.toString(tmp);
        }
        return answer;
    }


    public static void main(String[] args){
        System.out.println(solution(1)); // result = 1
        System.out.println(solution(2)); // result = 2
        System.out.println(solution(3)); // result = 4
        System.out.println(solution(4)); // result = 11

    }
}
