package org.example.chap8;

import java.util.Scanner;

public class Main3 {
    //5 20
    //10 5
    //25 12
    //15 8
    //6 3
    //7 4

    static int n,m,answer = 0;

    public static void DFS(int L, int sum, int time, int[] arrscore,int[] arrtime){
        if(time > m) return;
        if(L == n){
            if(sum > answer){
                answer = sum;
            }
        }else{
            DFS(L+1,sum+arrscore[L],time+arrtime[L],arrscore,arrtime);
            DFS(L+1,sum,time,arrscore,arrtime);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        for(int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        DFS(0,0,0,arr1,arr2);
        System.out.println(answer);
    }


}
