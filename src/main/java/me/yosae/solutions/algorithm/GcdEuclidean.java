package me.yosae.solutions.algorithm;

public class GcdEuclidean {
    public static int Euclidean(int a, int b){
        return b==0 ? a : Euclidean(b,a%b);
        //a가 b보다 작으면 a%b에서 알아서 자리가 바뀜
    }

    public static void main(String[] args){
        int a = 32;
        int b = 445;

        System.out.println(Euclidean(a,b));
    }
}
