//전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
//여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
//체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
//여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 본인을 우선시 합니다.


import java.util.Arrays;
import java.util.HashSet;

public class level1_CheYukBok {
    public static void main(String args[]){

        int n = 5;
        int[] lost = {1,4};
        int[] reserve = {1,3,5};

        int answer = n;
        HashSet res = new HashSet<>();
        for(int i : reserve) res.add(i);

        for(int i=0;i<lost.length;i++){
            if(res.contains(lost[i])) res.remove(lost[i]);
            else if(res.contains(lost[i]-1)) res.remove(lost[i]-1);
            else if(res.contains(lost[i]+1) && Arrays.binarySearch(lost,lost[i]+1)<0) res.remove(lost[i]+1);
            else answer--;
        }


        System.out.println(answer);
    }
}
