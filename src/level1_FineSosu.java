//1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환

//https://programmers.co.kr/learn/courses/30/lessons/12921

public class level1_FineSosu {

    static int solution(int n) {
        int answer = 0;

        boolean[] Sosu = new boolean[n];

        Sosu[0] = true;

        for(int i=2;i<=Math.sqrt(n);i++){
            int ersr = i+i;
            while(ersr<n+1){
                Sosu[ersr-1] = true;
                ersr += i;
            }
        }

        for(boolean i : Sosu){
            if(!i) answer++;
        }

        return answer;
    }


    public static void main(String[] args){


        System.out.println(solution(10));

    }
}
