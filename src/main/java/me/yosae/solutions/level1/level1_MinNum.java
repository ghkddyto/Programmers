package me.yosae.solutions.level1;//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수,
//solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.



import java.util.*;
class Solution {
    public Integer[] solution(int[] arr) {
        if(arr.length <= 1) return (new Integer[]{-1});
        
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i : arr) answer.add(i);
        
        answer.remove(Collections.min(answer));
        return answer.toArray(new Integer[answer.size()]);
    }
}
