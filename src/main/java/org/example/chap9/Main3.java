package org.example.chap9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time3 implements Comparable<Time3>{
    public int time;
    public char state;

    Time3(int time, char state){
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time3 ob) {
        if(this.time == ob.time) return this.state - ob.state;
        else return this.time - ob.time;
    }
}

public class Main3 {

    public static int solution(ArrayList<Time3> arr){
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;
        for(Time3 ob : arr){
            if(ob.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time3> arr = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int sT = sc.nextInt();
            int eT = sc.nextInt();
            arr.add(new Time3(sT,'s'));
            arr.add(new Time3(eT,'e'));
        }
        System.out.println(solution(arr));
    }

}
