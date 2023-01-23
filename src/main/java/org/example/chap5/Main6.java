package org.example.chap5;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main6 {

    public static int solution(int n, int m){
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1;i<=n;i++) queue.offer(i);

        while(queue.size() > 1){
            for(int i = 1; i < m; i++){
                queue.offer(queue.poll());
            }
            queue.poll();
        }

        return queue.poll();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(solution(n,m));
    }
}
