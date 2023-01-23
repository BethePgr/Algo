package org.example.chap5;

import java.util.Scanner;
import java.util.Stack;

public class Main5 {

    public static int solution(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ;i<str.length();i++){
            if(str.charAt(i)=='(') stack.push('(');
            else{
                if(str.charAt(i-1) == '('){
                    stack.pop();
                    answer+=stack.size();
                }else{
                    stack.pop();
                    answer+=1;
                }
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
