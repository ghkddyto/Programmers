//1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
// 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class level1_sufoja {
    public int score =0;
    public int jick[];


    public static void main(String[] args){

        int[] answers = {1,3,2,4,2};

        level1_sufoja[] Sufo = new level1_sufoja[3];
        Sufo[0] = new level1_sufoja();
        Sufo[1] = new level1_sufoja();
        Sufo[2] = new level1_sufoja();

        for(int i=0;i<3;i++) { //각 배열 크기 설정
            Sufo[i].jick = new int[answers.length];
        }

        int sufo1pat = 1;
        for(int j=0;j<answers.length;j++){ //수포자 1 답 초기화
            Sufo[0].jick[j] = sufo1pat;
            sufo1pat++;
            if(sufo1pat == 6) sufo1pat = 1;

        }

        int sufo2pat = 1;
        for(int j=0;j<answers.length;j++){ //수포자 2 답 초기화
            if(j%2==0) Sufo[1].jick[j] = 2;
            else {
                Sufo[1].jick[j] = sufo2pat ;
                sufo2pat++;
                if(sufo2pat==2) sufo2pat++;
                if(sufo2pat>5) sufo2pat = 1;
            }
        }

        int sufo3pat = 3;
        for(int j=0;j<answers.length;j++){ // 수포자 3 답 초기화

            Sufo[2].jick[j] = sufo3pat ;
            if(j < answers.length-1)Sufo[2].jick[j+1] = sufo3pat ;

            if(sufo3pat == 3) sufo3pat = 1;
            else if(sufo3pat == 2) sufo3pat = 4;
            else if(sufo3pat == 5) sufo3pat = 3;
            else sufo3pat++;
            j++;
        }


        System.out.println(Arrays.toString(Sufo[0].jick));
        System.out.println(Arrays.toString(Sufo[1].jick));
        System.out.println(Arrays.toString(Sufo[2].jick));

        ArrayList<Integer> max = new ArrayList<>();
        int count = 0;

        for(int i=0; i<3; i++){
            for(int j=0; j< answers.length;j++){
                if(Sufo[i].jick[j] == answers[j]) Sufo[i].score++;
            }

            max.add(Sufo[i].score);

        }

        System.out.println(Sufo[0].score);
        System.out.println(Sufo[1].score);
        System.out.println(Sufo[2].score);

        Collections.sort(max);
        System.out.println(max);
        for(int i=0;i<3; i++){
            if(Sufo[i].score == max.get(2)) count++;
        }

        int[] ans = new int[count];

        count = 0;

        for(int i=0;i<3;i++){
            if(Sufo[i].score == max.get(2)) {
                ans[count] = i+1;
                count++;
            }
        }

        System.out.println(Arrays.toString(ans));

    }
}
