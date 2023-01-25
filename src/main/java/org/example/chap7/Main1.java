package org.example.chap7;

public class Main1 {
    //자연수 n이 입력되면 재귀함수 이용해서 1부터 n까지 출력하기
    //재귀함수(스택프레임) -> 재귀함수는 자료구조 스택을 이용한다.

    public static void DFS(int n){
        if(n == 0) return;
        else{
            DFS(n-1);
            System.out.print(n + " ");
        }
    }




    public static void main(String[] args) {
        DFS(3);
    }


}
