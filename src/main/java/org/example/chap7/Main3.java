package org.example.chap7;

public class Main3 {
    //자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
    //예를 들어 5! = 5*4*3*2*1=120입니다.

    public static int DFS(int n){
        if (n == 1) return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args) {
        System.out.println(DFS(5));
    }
}
