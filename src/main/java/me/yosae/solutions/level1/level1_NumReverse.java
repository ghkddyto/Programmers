//https://programmers.co.kr/learn/courses/30/lessons/12932

//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
//예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

import java.util.Arrays;

public class level1_NumReverse {

    static int[] solution(long n) {
        String[] str = Long.toString(n).split("");
        int[] answer = new int[str.length];
        for(int i=0;i<str.length;i++)
            answer[i] = Integer.parseInt(str[str.length-i-1]);

        return answer;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(12345)));
    }
}
