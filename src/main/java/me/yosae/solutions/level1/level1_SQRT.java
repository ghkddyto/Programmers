//n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
//n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

//https://programmers.co.kr/learn/courses/30/lessons/12934

public class level1_SQRT {
    static long solution(long n) {
        double chk = Math.sqrt(n);
        return (chk%1 > 0) ? -1 : (long)Math.pow(chk+1,2);
    }


    public static void main(String[] args){
        System.out.println(solution(121)); // 144가 나와야함
        System.out.println(solution(3)); // -1이 나와야함
    }
}
