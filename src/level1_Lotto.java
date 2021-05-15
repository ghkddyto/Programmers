//로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어집니다.
//lottos에는 동생이 낙서를 하여 알아볼 수 없는 번호(0)이 존재합니다.
//이때, 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.
import java.util.*;

public class level1_Lotto{
    public static void main(String[] args){
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] answer = {7,7};

        Arrays.sort(win_nums);

        for(int i=0;i<6;i++){
            if(Arrays.binarySearch(win_nums,lottos[i])>=0 || lottos[i]==0)
                answer[0] -= 1;

        }

        for(int i=0;i<6;i++){
            if(Arrays.binarySearch(win_nums,lottos[i])>=0)
                answer[1] -= 1;
        }

        if(answer[0] == 7) answer[0] -= 1;
        if(answer[1] == 7) answer[1] -= 1;

        System.out.println("내 번호: 44, 1, 0, 0, 31, 25");
        System.out.println("당첨 번호: 31, 10, 45, 1, 6, 19");
        System.out.println("당첨 최댓값: " + answer[0] + "등");
        System.out.println("당첨 최솟값: " + answer[1] + "등");

    }
}
