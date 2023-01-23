package org.example.chap5;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {

    public static String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else if(x == ')'){
                while(stack.peek() != '('){
                    stack.pop();
                }
                stack.pop();
            }
            else stack.push(x);

        }

        for (char x : stack) {
            answer+=x;
        }
        return answer;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
