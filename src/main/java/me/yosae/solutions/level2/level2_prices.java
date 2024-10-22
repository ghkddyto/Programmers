package me.yosae.solutions.level2;  //초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

//입출력 예
//prices	
//[1, 2, 3, 2, 3]	
//return
//[4, 3, 1, 1, 0]

import java.util.Arrays;

public class level2_prices {
    static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0;i<prices.length;i++){
          for(int j=i+1;j<prices.length;j++){
              answer[i]++;
              if(prices[i]>prices[j]) break; 
          }
        }
        
        return answer;
    }


    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(new int[] {1,2,3,2,3}))); // result = {4, 3, 1, 1, 0}

    }
}
