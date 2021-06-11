//https://programmers.co.kr/learn/courses/30/lessons/12922

//길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수,
//solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

public class level1_watermelon {

    static String solution(int n) {
        String answer = "";

        while(answer.length() < n)
            answer += answer.length()%2 == 0 ? "수" : "박";

        return answer;
    }

    public static void main(String[] args){

        System.out.println(solution(123)); //9
    }
}