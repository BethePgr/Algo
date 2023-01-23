package org.example.chap5;

import java.util.Scanner;
import java.util.Stack;

public class Main3 {

    public static int solution(int n, int[][] board,int[] moves,int m){

        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if (board[j][moves[i]-1] != 0){
                    int temp = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0;
                    if(!stack.isEmpty() && stack.peek() == temp){
                        stack.pop();
                        answer +=2;
                    }

                    else stack.push(temp);
                    break;
                }
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [][] board = new int[n][n];
        for(int i = 0 ;i<n;i++){
            for(int j = 0 ;j<n;j++){
                board[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int [] moves = new int[m];
        for(int i = 0 ; i <m;i++) moves[i] = kb.nextInt();
        System.out.println(solution(n,board,moves,m));
    }
}
