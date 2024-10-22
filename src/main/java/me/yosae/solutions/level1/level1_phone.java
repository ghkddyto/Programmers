//전화번호가 문자열 phone_number로 주어졌을 때,
// 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수,
// solution을 완성해주세요.

public class level1_phone {
    static String solution(String phone_number) {
        String answer = "";
        String[] sav = phone_number.split("");
        int len = phone_number.length();

        for(int i=0;i<len-4;i++)
            answer += "*";

        for(int i=len-4;i<len;i++)
            answer += sav[i];

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("01032139805"));
        System.out.println(solution("0538205728"));
    }

}
