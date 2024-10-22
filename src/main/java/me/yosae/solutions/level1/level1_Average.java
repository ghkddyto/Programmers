package me.yosae.solutions.level1;
//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
//https://programmers.co.kr/learn/courses/30/lessons/12944

public class level1_Average {
    static double solution(int[] arr) {
        double answer = 0;
        for(int i : arr) answer += i;
        return answer/arr.length;
    }

    public static void main(String[] args){
        System.out.println(solution(new int[]{1,2,3,4})); //result = 43가 되야함
        System.out.println(solution(new int[]{5,5})); //result = 43가 되야함
    }
}
