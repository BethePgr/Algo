package org.example.chap8;

import java.util.Scanner;

public class Main2 {

    static int m,n,temp = 0;

    public void DFS(int L, int sum, int[] arr){
        if(sum > m) return;
        if(L == n){
            if(sum >temp){
                temp = sum;
            }
        }else{
            DFS(L+1,sum+arr[L],arr);
            DFS(L+1,sum,arr);

        }
    }



    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
        T.DFS(0,0,arr);
        System.out.println(temp);
    }
}
