package org.example.chap6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main8 {

    public static int solution(int n, int m, int[] arr){
        Arrays.sort(arr);
        int lt = 0;
        int rt = n-1;
        int mid=0;
        while(lt<rt){
            mid = (lt+rt)/2;
            if (m>arr[mid]) lt = mid;
            else if(m<arr[mid]) rt=mid;
            else break;
        }
        return mid+1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(solution(n,m,arr));
    }
}
