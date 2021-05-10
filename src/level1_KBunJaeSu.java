import java.util.ArrayList;
import java.util.Collections;

//배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
//배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
//commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

import java.util.ArrayList;
        import java.util.Collections;

public class level1_KBunJaeSu  {
    public static void main(String[] args){

        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] solutions = new int[commands.length];

        for(int a=0; a<commands.length; a++){

            ArrayList<Integer> cut = new ArrayList<>();
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];

            for(int b=i-1;b<=j-1;b++){
                cut.add(array[b]);
            }
            System.out.println(cut);

            Collections.sort(cut);
            solutions[a] = cut.get(k-1);
        }

        System.out.println(solutions[0]);
        System.out.println(solutions[1]);
        System.out.println(solutions[2]);

    }
}
