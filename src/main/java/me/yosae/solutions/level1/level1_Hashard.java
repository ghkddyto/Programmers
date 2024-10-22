//18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
//자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

//https://programmers.co.kr/learn/courses/30/lessons/12947

public class level1_Hashard {

    static boolean solution(int x) {
        boolean answer = true;

        int h = 0;
        String[] s = Integer.toString(x).split("");
        for(String i : s)
            h += Integer.parseInt(i);

        if(x%h!=0) answer = false;
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(18)); //true
    }
}
