//numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아
//더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return
//https://programmers.co.kr/learn/courses/30/lessons/68644

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class level1_Choose_n_increase {
    static int[] solution(int[] numbers) {

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<numbers.length;i++)
            for(int j=i+1;j<numbers.length;j++)
                hs.add(numbers[i]+numbers[j]);

        Iterator it = hs.iterator();

        int[] answer = new int[hs.size()];
        for(int i=0;i<hs.size();i++)
            answer[i] = (int)it.next();

        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args){

        int[] Q1 = {2,1,3,4,1};
        int[] Q2 = {5,0,2,7};

        for(int i : Q1)  System.out.print(i + " ");
        System.out.println("");
        for(int i : Q2)  System.out.print(i + " ");
    }
}
