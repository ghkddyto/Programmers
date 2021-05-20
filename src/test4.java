//로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어집니다.
//이때, 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.
import java.io.*;
import java.util.*;
public class test4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = sc.nextInt(); // 수열의 크기
        int[] num = new int[size];

        for(int i=0;i<size;i++){
            num[i] = sc.nextInt(); // 수열 초기화
        }
        int Q = sc.nextInt(); //질의 수

        for(int i=0; i<Q; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int ans = 0;
            for(int j=start-1;j<end;j++)
                ans += num[j];
            bw.write(ans+"\n");
        }
        bw.flush(); bw.close();
    }
}
