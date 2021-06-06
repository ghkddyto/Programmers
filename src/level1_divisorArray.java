//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

//https://programmers.co.kr/learn/courses/30/lessons/12910
import java.util.ArrayList;

public class level1_divisorArray {
    static Integer[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i:arr)
            if(i%divisor == 0) answer.add(i);

        java.util.Collections.sort(answer);

        if(answer.isEmpty()) answer.add(-1);

        return answer.toArray(new Integer[answer.size()]);
    }

    public static void main(String[] args){
        System.out.println(solution(new int[]{5, 9, 7, 10}, 5)); //5, 10이 나와야 함
    }
}
