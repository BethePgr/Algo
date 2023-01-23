package org.example.chap5;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {


    public static String solution(String str){
        String answer = "";

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if (x == '(') stack.add(x);
            else if (x== ')'){
                if(stack.isEmpty()) return "NO";
                else if (stack.peek() == '(') {
                    stack.pop();
                }
            }
        }

        if (stack.size() == 0) return "YES";
        else return "NO";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));


    }
}
