package me.yosae.solutions.level1;//정수 num이 짝수일 경우 "Even"을 반환하고
//홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

class level1_evenNum {
    public static String solution(int num) {
        return (num%2==0) ? "Even" : "Odd";
    }
    
    public static void main(String args[]){
        System.out.println(solution(10)); // Even
        System.out.println(solution(11)); // Odd
    }
}
