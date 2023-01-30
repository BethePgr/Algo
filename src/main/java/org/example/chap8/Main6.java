package org.example.chap8;

import java.util.Scanner;

public class Main6 {
    static int[] pm,ch,arr;
    static int n,m;

    public static void DFS(int L){
        if(L == m){
            for(int x: pm) System.out.print(x+ " ");
            System.out.println();
        }else{
            for(int i = 0;i<n;i++){
                if(ch[i]==0){
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
        ch = new int[n];
        pm = new int[m];
        DFS(0);
    }
}