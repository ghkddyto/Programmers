//문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
//각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
//예를 들어 s["sun", "bed", "car"], 1이면 각 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

//https://programmers.co.kr/learn/courses/30/lessons/12915

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class level1_StringSort {

    static String[] solution(String[] str, int n) {

        ArrayList<String> answer = new ArrayList<>();
        ArrayList<String> t;

        for (char c = 'a'; c <= 'z'; c++) {
            t = new ArrayList<>();

            for (String s : str)
                if (c == s.charAt(n)) t.add(s);

            Collections.sort(t);
            answer.addAll(t);
        }

        return  answer.toArray(new String[answer.size()]);
    }

    public static void main(String[] args){


        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"},1)));

    }
}
