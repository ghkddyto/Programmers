//String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아,
// "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
//seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

//https://programmers.co.kr/learn/courses/30/lessons/12919

import java.util.ArrayList;
import java.util.Arrays;

public class level1_Kim {
    public static void main(String[] args){

        String[] seoul = {"asd","Jane", "Kim"};

        ArrayList<String> seo = new ArrayList<>(Arrays.asList(seoul));
        int n = seo.indexOf("Kim");

        String answer = "김서방은 " + n + "에 있다";

        System.out.println(answer);

    }
}
