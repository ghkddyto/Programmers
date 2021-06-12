//https://programmers.co.kr/learn/courses/30/lessons/17682

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class level1_DartGame {

    static int solution(String dartResult) {

        Queue<String> Q = new LinkedList<>();
        for(String s : dartResult.split("")) Q.add(s);
        Stack<Integer> ans = new Stack<>();

        while(!Q.isEmpty()){

            int score = Integer.parseInt(Q.poll());
            if(Q.peek().equals("0")) {score += 9 ; Q.poll();}

            int SDT = 1;
            switch(Q.poll().charAt(0)){
                case 'D' : SDT = 2; break;
                case 'T' : SDT = 3; break;
            }

            int option = 1;
            if(!Q.isEmpty() && Q.peek().equals("*")){
                option = 2; Q.poll();
                if(!ans.empty())
                    ans.push(ans.pop()*2);
            }
            else if(!Q.isEmpty() && Q.peek().equals("#")){
                option = -1; Q.poll();
            }

            ans.push((int)Math.pow(score,SDT) * option);
        }


        return ans.pop() + ans.pop() + ans.pop();
    }

    public static void main(String[] args){

        System.out.println(solution("1D2S#10S")); //9
    }
}