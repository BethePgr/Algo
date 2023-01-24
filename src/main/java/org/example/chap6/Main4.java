package org.example.chap6;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main4 {

    public static Deque<Integer> solution(int n , int m, int[] arr){
        Deque<Integer> dq = new LinkedList<>();

        for(int i =0;i<m;i++){
            if (dq.size()<n) {
                if (!dq.contains(arr[i])) dq.offerFirst(arr[i]);
                else {
                    dq.removeFirstOccurrence(arr[i]);
                    dq.offerFirst(arr[i]);
                }
            }else{
                if (!dq.contains(arr[i])) {
                    dq.offerFirst(arr[i]);
                    dq.removeLast();
                }else {
                    dq.removeFirstOccurrence(arr[i]);
                    dq.offerFirst(arr[i]);
                }
            }

        }
        return dq;
    }
//        5 9
//        1 2 3 2 6 2 3 5 7

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i = 0;i<m;i++) arr[i] = sc.nextInt();

        for(int x : solution(n,m,arr)) System.out.print(x + " ");
    }
}
