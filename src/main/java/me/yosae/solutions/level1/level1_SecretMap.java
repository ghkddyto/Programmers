//https://programmers.co.kr/learn/courses/30/lessons/17681

import java.util.*;

class level1_SecretMap {
    static String[] solution(int n, int[] arr1, int[] arr2) {
        ArrayList<String> ans = new ArrayList<>();
        for(int k=0;k<n;k++)
            ans.add("");
        String[] answer = ans.toArray(new String[n]);


        for(int i=0;i<n;i++){
            String[] s1 = Integer.toBinaryString(arr1[i]).split("");
            String[] s2 = Integer.toBinaryString(arr2[i]).split("");
            if(s1.length < n){
                Stack<String> tmp1 = new Stack<>();
                for(int k=s1.length-1;k>=0;k--)
                    tmp1.push(s1[k]);

                for(int k=0;k<n-s1.length;k++)
                    tmp1.push("0");

                ArrayList<String> al1 = new ArrayList<>();
                for(int k=0;k<n;k++)
                    al1.add(tmp1.pop());

                s1 = al1.toArray(new String[n]) ;
            }
            System.out.println(Arrays.toString(s1));
            if(s2.length < n){
                Stack<String> tmp2 = new Stack<>();
                for(int k=s2.length-1;k>=0;k--)
                    tmp2.push(s2[k]);

                for(int k=0;k<n-s2.length;k++)
                    tmp2.push("0");

                ArrayList<String> al2 = new ArrayList<>();
                for(int k=0;k<n;k++)
                    al2.add(tmp2.pop());

                s2 = al2.toArray(new String[n]) ;
            }

            for(int j=0;j<n;j++){

                if(s1[j].equals("1") || s2[j].equals("1")) answer[i] += "#";
                else answer[i] += " ";

            }

        }

        return answer;
    }

    public static void main(String args[]){

        System.out.println(Arrays.toString(solution(5,new int[]{9,20,28,18,11}, new int[]{30,1,21,17,28})));

    }
}
