package org.example.chap9;

//프림, PriorityQueue

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edges implements Comparable<Edges>{
    public int vex;
    public int cost;
    Edges(int vex, int cost){
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edges ob) {
        return this.cost - ob.cost;
    }
}

public class Main8 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        ArrayList<ArrayList<Edges>> graph = new ArrayList<ArrayList<Edges>>();
        for(int i = 0;i<=n;i++){
            graph.add(new ArrayList<Edges>());
        }
        int[] ch = new int[n+1];
        for(int  i = 0;i<m;i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            graph.get(a).add(new Edges(b,c));
            graph.get(b).add(new Edges(a,c));
        }
        int answer = 0;
        PriorityQueue<Edges> pQ = new PriorityQueue<>();
        pQ.offer(new Edges(1,0));
        while(!pQ.isEmpty()){
            Edges tmp = pQ.poll();
            int ev = tmp.vex;
            if(ch[ev] == 0){
                ch[ev] = 1;
                answer+=tmp.cost;
                for(Edges ob : graph.get(ev)){
                    if(ch[ob.vex] == 0) pQ.offer(new Edges(ob.vex, ob.cost));
                }
            }
        }
        System.out.println(answer);
    }

}
