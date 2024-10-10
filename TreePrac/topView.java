package TreePrac;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import Basics.breakLoop;

public class topView {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    
    static class BinaryTree{


        static int idx = -1;
        public static Node buildTree(int nodes[]){

            idx++;

            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        
    }

    public static boolean isIdentical(Node root, Node subroot){

        if(root == null && subroot == null){
            return true;
        }else if(root == null || subroot == null || root.data != subroot.data){
            return false;
        }

        if(!isIdentical(root.left, subroot.left)){
            return false;
        }

        if(!isIdentical(root.right, subroot.right)){
            return false;
        }

        return true;
    }


    public static boolean isSubtree(Node root, Node subroot){

        if(root == null){
            return false;
        }

        if(root.data == subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }

        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    static class Info{
        Node node;
        int hd;

        Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topview(Node root){
        //Level Order Traversal
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> mp = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!mp.containsKey(curr.hd)){
                    //first time my horizontal distance (hd) is occuring
                    mp.put(curr.hd, curr.node);
                }
    
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
    
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }

           
        }

        for(int i = min; i<max;i++){
            System.out.print(mp.get(i).data+" ");
        }
        System.out.println();

    }

    public static void main(String args[]){

       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7);


    //    Node subroot = new Node(2);
    //    subroot.left = new Node(4);
    //    subroot.right = new Node(5);
       
       //subTree tree = new subTree();
//         System.out.println(isSubtree(root,subroot));

          topview(root);
    } 
    
}

