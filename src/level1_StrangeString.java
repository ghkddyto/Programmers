//문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
//각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

//https://programmers.co.kr/learn/courses/30/lessons/12930


public class level1_StrangeString {

    static String solution(String s) {
        char[] ans = s.toCharArray();
        for(int i=0, count = 0; i<ans.length; i++,count++){
            if(ans[i] == ' ') count=-1;
            ans[i] = count%2 == 0 ? Character.toUpperCase(ans[i]) : Character.toLowerCase(ans[i]);
        }
        return String.valueOf(ans);
    }

    public static void main(String[] args){
        System.out.println(solution("try hello world")); // "TrY HeLlO WoRlD"가 출력되야함

    }
}
