package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreeTraversal {
    static Scanner sc = null;
    public static void main(String args[]){
        sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        Node root = createTree();
        System.out.println();
        inOrder(root,arr);
        System.out.println();
        PreOrder(root, arr);
        System.out.println();
        PostOrder(root, arr);

        System.out.println();
        System.out.println("max node is "+ Maximum(root));
    }

    static Node createTree(){
        Node root = null;
        System.out.println("Enter data: ");
        
        int data = sc.nextInt();

        if(data==-1)return null;


        root = new Node(data);

        System.out.println("Enter left for :" +data);
        root.left = createTree();

        System.out.println("Enter right for :" +data);
        root.right = createTree();


        return root;
    }

    public static void inOrder(Node root,List<Integer> arr){

        // for inorder -> LNR
        if(root == null) return;

        inOrder(root.left,arr);
        arr.add(root.data);
        System.out.print(root.data+" ");
        inOrder(root.right,arr);
    }

    public static void PreOrder(Node root,List<Integer> arr){

        // for inorder -> LNR
        if(root == null) return;

        arr.add(root.data);
        System.out.print(root.data+" ");
        PreOrder(root.left,arr);
        PreOrder(root.right,arr);
    }

    public static void PostOrder(Node root,List<Integer> arr){

        // for inorder -> LNR
        if(root == null) return;

        PreOrder(root.left,arr);
        PreOrder(root.right,arr);
        System.out.print(root.data+" ");
        arr.add(root.data);
    }

    // max vode value
    public static int Maximum(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(Maximum(root.left), Maximum(root.right)));
    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}