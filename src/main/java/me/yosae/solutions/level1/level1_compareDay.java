package me.yosae.solutions.level1;

import java.util.Arrays;
import java.util.HashMap;

/*
오늘 날짜를 의미하는 문자열 today, 약관의 유효기간을 담은 1차원 문자열 배열 terms와 수집된 개인정보의 정보를 담은 1차원 문자열 배열 privacies가 매개변수로 주어집니다. 이때 파기해야 할 개인정보의 번호를 오름차순으로 1차원 정수 배열에 담아 return 하도록 solution 함수를 완성해 주세요.
 */
public class level1_compareDay {

    public static void main(String args[]){
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(solution(today, terms, privacies)));
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = new int[terms.length];





        return Arrays.stream(answer).map(n -> n+1).toArray();
    }

    public boolean compareDay(String today, String privacy, HashMap<String,Integer> termCode){

        int[] todayDate = Arrays.stream(today.split("\\.")).mapToInt(Integer::parseInt).toArray();
        String privacyCode = privacy.split(" ")[1];
        int[] privacyDate = Arrays.stream(privacy.split(" ")[0].split("\\.")).mapToInt(Integer::parseInt).toArray();

        int expireDay = termCode.get(privacyCode) * 28 - 1;
        int parsingToday = ((todayDate[0]*12) + todayDate[1])*28 + todayDate[2];
        int parsingPrivacyDay = ((privacyDate[0]*12) + privacyDate[1])*28 + privacyDate[2];

        return parsingPrivacyDay - parsingToday <= expireDay;
    }
}
