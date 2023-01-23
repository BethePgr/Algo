package org.example.chap5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7 {

    public static String solution(String str1, String str2){
        Queue<Character> queue1 = new LinkedList<>();
        Queue<Character> queue2 = new LinkedList<>();
        for (char x : str1.toCharArray()) queue1.offer(x);
        for (char x : str2.toCharArray()) queue2.offer(x);
        int size = queue2.size();

        for(int i = 0;i < size;i++){
            if (queue1.peek() == queue2.peek()){
                queue1.poll();
                queue2.poll();
            }else{
                queue2.poll();
            }

        }
        if (queue1.isEmpty()) return "YES";
        else return "NO";

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.next();
        System.out.println(solution(str1, str2));


    }
}
