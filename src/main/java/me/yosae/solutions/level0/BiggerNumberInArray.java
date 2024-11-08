package me.yosae.solutions.level0;

import java.util.Arrays;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120585
머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
 */
public class BiggerNumberInArray {
    public static int solution(int[] array, int height) {
        int answer = 0;

        answer = (int) Arrays.stream(array).filter(n -> n > height).count();

        return answer;
    }

    public static void main(String[] args){

        int[] array = {123,321,213,124,151,512};

        System.out.println(solution(array,171));
    }
}
