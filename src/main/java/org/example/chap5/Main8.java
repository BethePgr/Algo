package org.example.chap5;

import java.util.*;

import static java.util.Collections.max;

class Person{

    int id;
    int priority;

    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}

public class Main8 {

    public static int solution(int n,int m ,int [] arr){
        int answer = 0;
        Queue<Person> q = new LinkedList<>();
        for(int i =0;i<n;i++){
            q.offer(new Person(i,arr[i]));
        }

        while(!q.isEmpty()){
            Person tmp = q.poll();
            for(Person x: q){
                if(x.priority > tmp.priority){
                    q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp != null){
                answer++;
                if(tmp.id == m) return answer;

            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n,m,arr));


    }
}
