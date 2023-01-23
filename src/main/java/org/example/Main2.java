package org.example;


import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main2 {

    public static int solution(int[] arr, int n, int k){

        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int l = j + 1;l<n;l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x : Tset) {
            cnt++;
            if(cnt==k) return x;
        }
        return -1;
    }


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(solution(arr,n,k));
    }


}
