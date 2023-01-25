package org.example.chap7;

public class Main4 {
    //1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는
    //수열이다.
    //2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면
    //된다.

    static int [] fibo;

    public static int DFS(int n){
        if(n == 1) return 1;
        else if(n == 2) return 1;
        fibo[n] =  fibo[n - 1] + fibo[n - 2];

        return fibo[n];

    }

    public static void main(String[] args) {
        int n = 45;
        fibo = new int[n+1];
        fibo[1] = 1;
        fibo[2] = 1;

        DFS(3);
        for(int i = 1;i<=n;i++)System.out.print(i + "_"+DFS(i) + " ");
    }
}
