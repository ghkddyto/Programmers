//게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해
//작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때,
//크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 return

//https://programmers.co.kr/learn/courses/30/lessons/64061

import java.util.Stack;

public class level1_CrainPickup {
    public static void main(String[] args){

        int answer = 0;
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        Stack<Integer> basket = new Stack<>();

        int tri = board.length;

        for(int i : moves) {

            for (int j = 0; j < tri; j++) {
                int chk = board[j][i-1];
                if (chk != 0)
                    if (!basket.isEmpty() && basket.peek() == chk) {
                        basket.pop();
                        answer += 2;
                        board[j][i-1] = 0;
                        break;
                    } else {
                        basket.push(chk);
                        board[j][i-1] = 0;
                        break;
                    }
            }
        }
        System.out.println(answer);

    }
}
