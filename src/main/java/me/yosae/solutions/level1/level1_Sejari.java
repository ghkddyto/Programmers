//369와 같은 세자리 수가 있으면 각 자리수를 더한 답을 도출 ( 3+6+9=18 )

public class level1_Sejari {
    public static void main(String[] args){
        int answer = 0;
        int n = 369;
        String s = String.valueOf(n);
        String[] s2 = s.split("");

        for(String q : s2){
            answer += Integer.parseInt(q);
        }

        System.out.println(answer);
    }
}