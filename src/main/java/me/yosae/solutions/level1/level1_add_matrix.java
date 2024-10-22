package me.yosae.solutions.level1;
import java.util.Arrays;
public class level1_add_matrix {
    //2개의 행렬 arr1과 arr2를 입력받아,
//행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.


    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};

        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
