//최대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택하려 합니다. 
//N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때, 
//N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아, 
//그때의 폰켓몬 종류 번호의 개수를 return 하도록 solution 함수를 완성해주세요.

import java.util.HashSet;

public class level1_Ponkemon {
    public static void main(String[] args){

        int[] nums = {3,3,3,2,2,4};
        int answer;
        HashSet<Integer> nums2 = new HashSet<>();
        for(int i : nums){
            nums2.add(i);
        }
        if(nums2.size() >= nums.length/2) answer = nums.length/2;
        else answer = nums2.size();


        System.out.println(answer);
    }

}
