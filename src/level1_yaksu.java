//https://programmers.co.kr/learn/courses/30/lessons/77884

//두 정수 left와 right가 매개변수로 주어집니다.
//left부터 right까지의 모든 수들 중에서,
//약수의 개수가 짝수인 수는 더하고,
//약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

public class level1_yaksu {
    static int solution(int left, int right) {
        int answer = 0;

        for(int i=left;i<=right;i++){
            int chk = 1;

            for(int j=2;j<=i;j++)
                if(i%j == 0) chk++;

            answer = (chk%2==0) ? answer+i : answer-i;
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(13,17)); //result = 43가 되야함
        System.out.println(solution(24,27)); //result = 52가 되야함
    }

}
