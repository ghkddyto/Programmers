package me.yosae.solutions;//마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
//완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요

import java.util.Arrays;

public class level1_Maraton {
    public static void main(String[] args){

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"} ;
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0;i<completion.length;i++){
            if(completion[i].equals(participant[i])) continue;
            System.out.println(participant[i]); //return
        }
        System.out.println(participant[participant.length-1]); //return

    }

}
