//수식이 주어질 때 같은 짝의 괄호의 위치를 찾는 문제이다.
//(a*(b+c)+d)
//이 경우에는 3과 7 , 0과 10이 한 쌍의 괄호이다.

//[입력]
//입력은 공백없이 입력된다. 입력되는 문자는 소문자,소괄호,(+,-,*,/)이다.
//문자열의 길이는 최대 50 까지이다.

//[출력]
//왼쪽에서 오른쪽을 가면서 먼저 짝이 맞는 (여는 괄호 위치, 닫는 괄호 위치) 순으로 출력하고, 짝이 맞지 않는 수식은 not match를 출력한다.

import java.util.*;

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
