package org.example.chap7;

public class Main9 {
    //루트노드에서 말단노드까지 가는 길이 중 가장 짧은 길이를 구하여라.

    static Node root;

    public static int DFS(int L, Node root){
        if(root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L+1,root.lt),DFS(L+1, root.rt));
    }

    public static void main(String[] args) {

        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        DFS(0,root);

    }
}
