//https://programmers.co.kr/learn/courses/30/lessons/12901

//2016년 1월 1일은 금요일입니다. (윤년)
//2016년 a월 b일은 무슨 요일일까요?
//두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.

import java.util.ArrayList;

public class level1_Date {
    static String solution(int a, int b) {

        int day = 0;
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        for(int i=0; i<a-1; i++) day += month[i];
        day = (b + day - 1) % 7;

        return days[day];
    }

    public static void main(String[] args){
        System.out.println(solution(5,24)); //tue가 나와야 함.

    }

}
