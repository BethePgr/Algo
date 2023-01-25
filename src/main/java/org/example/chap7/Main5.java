package org.example.chap7;


//아래 그림과 같은 이진트리를 전위순회와 후위순회를 연습해보세요.

class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt = rt = null;
    }
}

public class Main5 {

    static Node root;
    public static void DFS(Node root){
        if(root == null) return;
        else{
            //전위순회 System.out.println(root.data);
            DFS(root.lt);
            //중위System.out.println(root.data);
            DFS(root.rt);
            System.out.println(root.data);
        }
    }

    public static void main(String[] args) {

        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        DFS(root);


    }




}
