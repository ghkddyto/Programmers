package me.yosae.solutions.level0;

import java.util.Arrays;

public class ArrayInDouble {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        answer = Arrays.stream(numbers)
                .map(n -> n*2).toArray();

        return answer;
    }
}
