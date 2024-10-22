//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
//단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//https://programmers.co.kr/learn/courses/30/lessons/12903

public class level1_CenterString {

    static String solution(String s) {
        String answer = "";

        String[] sp = s.split("");

        if(s.length() % 2 != 0)
            answer = sp[s.length()/2] + "";

        else
            answer =  sp[s.length()/2-1] + "" + sp[s.length()/2];

        return answer;
    }

    public static void main(String[] args){

        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));

    }

}
