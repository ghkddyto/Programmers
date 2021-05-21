//[입력]
//첫 줄에는 수열의 크기 n ( 1 <= n <= 100000) 이 주어지고
//다음 줄에는 수열이 .. 수열의 시작위치는 1이다. 각 수는 -100 이상 100 이하이다.
//다음 줄에는 질의 수 q ( 1 <= q <= 100000) 가 주어지고
//다음 q 개의 줄에는 시작 구간과 끝 구간이 주어진다.

//[출력]
//각 구간의 합을 출력한다.

import java.util.*;
import java.io.*;


public class Test5 {
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = sc.nextInt(); // 수열의 크기
        int[] num = new int[size];

        for(int i=0;i<size;i++)
            num[i] = sc.nextInt(); // 수열 초기화

        int Q = sc.nextInt(); //질의 수

        for(int i=0;i<Q;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int ans = 0;
            for(int j=start-1;j<end;j++)
                ans += num[j];
            bw.write(ans + "\n");
        }
        bw.flush(); bw.close();

    }
}
