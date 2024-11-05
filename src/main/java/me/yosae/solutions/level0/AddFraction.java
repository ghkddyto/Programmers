package me.yosae.solutions.level0;

import java.util.Arrays;

public class AddFraction {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        int maxNum = 1;

        for(int i=1; i<=numer && i<=denom; i++){
            if(numer%i == 0 && denom%i == 0)
                maxNum = i;
        }


        return new int[]{numer/=maxNum,denom/=maxNum};
    }

    public static void main(String[] args){
        int numer1 = 1;
        int denom1 = 2;

        int numer2 = 5;
        int denom2 = 4;

        System.out.println(Arrays.toString(solution(numer1,denom1,numer2,denom2)));

    }
}
