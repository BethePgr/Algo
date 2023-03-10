package org.example.chap7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main13 {
    //정점번호가 엄청나게 많을때는 인접행렬보다는 인접리스트가 더 좋음
    //인접행렬은 너무 효율이 안 좋음 정점이 많으면
    static int n,m,answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;


    public void DFS(int v){

        if(v==n) answer++;
        else{
            for(int nv : graph.get(v)){
                if(ch[nv] == 0){
                    ch[nv]  =1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }



    }

    public static void main(String[] args) {
        Main13 T = new Main13();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i =0;i<=n;i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for(int i = 0;i<m;i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }


}
