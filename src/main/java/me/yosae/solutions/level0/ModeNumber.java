package me.yosae.solutions.level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ModeNumber { //배열 내 최빈값
    public int solution(int[] array) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : array){
            if(map.get(i) == null)
                map.put(i,1);
            else
                map.put(i, map.get(i)+1);

            // == map.merge(i, 1, Integer::sum);
        }

        int modeNum = 0;
        int modeSize = 0;
        for(int i : array){
            if(map.get(i) > modeSize) {
                modeNum = i;
                modeSize = map.get(i);
            }
        }

        map.remove(modeNum);

        if(map.containsValue(modeSize)) return -1;
        else return modeNum;

    }
}
