package me.yosae.solutions.level0;

public class FactorialBalls {
    public static int factorial(int n){
        int hap = 1;
        for(int i=1; i<=n; i++)
            hap *= i;
        return hap;
    }

    public static int solution(int balls, int share, int b) {
        if(balls == 0 || share == 0) return 0;
        if(balls == share) return 1;
        else return factorial(balls) / (factorial(balls-share) * factorial(share));
    }

    public static long solution(int balls, int share) {
        long answer = 1L;
        int cnt = 1;

        while(cnt <= share) {
            answer *= balls--;
            answer /= cnt++;
        }

        /*
        5 4 3 2
        ---------
        2 3 2
        */
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(5,4));
        System.out.println(solution(3,2));
        System.out.println(solution(30,3));
        System.out.println(solution(24,6));
        System.out.println(solution(13,5));
        System.out.println(solution(12,4));
    }
}
