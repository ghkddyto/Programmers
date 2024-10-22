//absolutes 배열에는 정수의 절대값, sings에는 그 절대값이 양수(true)인지 음수(false)인지 저장되어있다.
//모두 더한 값을 구하시오.

public class level1_Juldaekap {
    public  static void main(String[] args){
        int[] absolutes = { 3, 5, 2, 6, 8 };
        boolean[] signs = { true, true, false, false, true };
        int answer = 0;

        for(int i=0; i<absolutes.length;i++){
            if(signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }


        System.out.println(answer);
    }
}
