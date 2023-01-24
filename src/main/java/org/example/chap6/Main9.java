package org.example.chap6;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main9 {

    public static int count(int [] arr, int capacity){
        int cnt = 1, sum = 0;
        for(int x: arr){
            if(sum + x > capacity){
                cnt++;
                sum = x;
            }else sum +=x;
        }
        return cnt;
    }

    public static int solution(int n, int m, int[] arr){
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt<=rt){
            int mid = (lt + rt)/2;
            if(count(arr, mid) <=m){
                answer = mid;
                rt = mid - 1;
            }else{
                lt = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(solution(n,m,arr));
//        int[] arr = {1,2,3};
//        int sum = Arrays.stream(arr).sum();
//        int min = Arrays.stream(arr).min().getAsInt();
//        System.out.println(sum);
//        System.out.println(min);
    }
}
