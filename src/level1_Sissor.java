//어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
//예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, "z"는 1만큼 밀면 "a"가 됩니다.
//문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

public class level1_Sissor {
    public String solution(String s, int n) {
        String answer = "";
        for(char a : s.toCharArray()){
            if(a>64&&a<91) {
                a += n%26;
                if(a>90) a -= 26;
            }

            else if(a>96&&a<123){
                a += n%26;
                if(a>122) a -= 26;
            }
            answer += a;
        }
        return answer;
    }

    public static void main(String[] args){

        level1_Sissor cc = new level1_Sissor();
        System.out.println(cc.solution("AB", 1));
        System.out.println(cc.solution("z", 1));
        System.out.println(cc.solution("Z", 10));
        System.out.println(cc.solution("a B z", 4));
        System.out.println(cc.solution(" aBZ", 20));
        System.out.println(cc.solution("y X Z", 4));
        System.out.println(cc.solution(" . h z", 20));

    }

}
