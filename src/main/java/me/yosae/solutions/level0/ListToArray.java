package me.yosae.solutions.level0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListToArray {
    public int[] solution(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(i%2!=0) list.add(i);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
