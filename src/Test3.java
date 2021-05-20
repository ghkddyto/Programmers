//로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어집니다.
//이때, 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args){

        String Q = "(a*(b+c)+d)";
        String[] s = Q.split("");
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for(int i=0;i<s.length;i++){
            if(s[i].equals("(")) left.add(i);
            else if(s[i].equals(")")) right.add(i);
        }

        if(left.size() != right.size()) System.out.println("not match");
        else
            for(int i=0;i<left.size();i++)
                System.out.println(left.get(left.size()-1-i) + " " + right.get(i));

    }
}
