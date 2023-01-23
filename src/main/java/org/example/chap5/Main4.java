package org.example.chap5;

import java.util.Scanner;
import java.util.Stack;

public class Main4 {

    public static int solution(String str){
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if(Character.isDigit(x)) stack.push(x - '0');
            else{
                Integer pop1 = stack.pop();
                Integer pop2 = stack.pop();
                if (x == '+') stack.push(pop1+pop2);
                else if (x == '-') stack.push(pop2-pop1);
                else if (x == '*') stack.push(pop2*pop1);
                else if (x == '/') stack.push(pop2/pop1);

            }
        }
        return stack.peek();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
