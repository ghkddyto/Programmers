//배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

//https://programmers.co.kr/learn/courses/30/lessons/12906

import java.util.ArrayList;
import java.util.Arrays;

public class level1_noSameNum {
    static Integer[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int chk = arr[i];
            while(i<arr.length-1 && chk == arr[i+1]){
                arr[i+1] = -1;
                i++;
            }
        }
        for(int i: arr)if(i>-1) answer.add(i);

        return answer.toArray(new Integer[answer.size()]);
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(new int[]{1,1,3,3,0,1,1}))); //1,3,0,1가 나와야 함.
        System.out.println(Arrays.toString(solution(new int[]{4,4,4,3,3}))); //4,3가 나와야 함.
    }
}
