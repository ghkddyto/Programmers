//자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
//이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

public class level1_SamJinsoo {
    static int solution(int n) {
        String answer = "";
        int j = 3; //진수

        while (n>0){
            answer += n%j;
            n /= j;
        }

        return Integer.parseInt(answer,j);
    }

    public static void main(String[] args){

        System.out.println(solution(45)); //7이 나와야함
        System.out.println(solution(125)); //229가 나와야함

    }


}
