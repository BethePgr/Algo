package org.example.chap7;

import java.util.Scanner;

public class Main12 {
    //가지수를 출력할때는 DFS
    //인접행렬로 품
    static int n, m, answer = 0;
    static int [][] graph;
    static int [] ch;


    public void DFS(int v){

        if(v == n) answer++;
        else{
            for(int i = 0;i<=n;i++){
                if(graph[v][i] == 1 && ch[i]==0){
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Main12 T = new Main12();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n+1][m+1];
        ch = new int[n+1];
        for(int i = 0 ; i<m;i++){
            int a = kb.nextInt();
            int b= kb.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }






}
