//[입력]
//20개의 수가 입력으로 주어진다. 각 수는 -30 이상 30 이하의 수이다.
//[출력]
//첫 줄에는 최대 합을 출력하고 다음 줄에는 두 수를 출력한다. 출력 순서는 관계가 없다.
//여러 개의 답이 존재하는 경우 만족하는 답 중 하나를 출력한다.

public class Test2 {
    public static void main(String[] args){

        int[] Q = {28, -28, 27, 3, -22, 29, 2, 1, -2, 16, -8, 5, -7, 21,
                -25, -14, 26, -20, 15, 21};

        int ans = Q[0] + Q[1];
        int ans1 = Q[0];
        int ans2 = Q[1];

        for(int i=0;i<Q.length;i++){
            for(int j=0;j<Q.length-1;j++){
                if(i==j) continue;
                else if(Q[i]+Q[j]>ans) {
                    ans = Q[i] + Q[j];
                    ans1 = Q[i];
                    ans2 = Q[j];
                }
            }
        }

        System.out.println(ans);
        System.out.println(ans1 + " " + ans2);

    }
}
