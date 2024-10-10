package Tree;

import Recurrsion.removeDuplicate;
import example.carnivors;

public class TreeHight {


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


    public static int hight(Node root){

        if(root == null){
            return 0;
        }

        int lh = hight(root.left);
        int rh = hight(root.right);

        return Math.max(lh, rh)+1;
    }

    public static int sum(Node root){

        if(root == null){
            return 0;
        }

        int lh = hight(root.left);
        int rh = hight(root.right);

        return lh+rh+1;
    }

    public static int diameter(Node root){
        //O(N^2)
        if(root == null){
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHight = hight(root.left);
        int rightDiam = diameter(root.right);
        int rightHight = hight(root.right);

        int selfDiam = leftHight+rightHight+1;

        return Math.max( selfDiam, Math.max(rightDiam, leftDiam));


    }


    static class info {
        int diameter;
        int hight;

        info(int diameter, int height){
            this.diameter = diameter;
            this.hight = height;
        }
    }

    public static info diameter1(Node root){
        //O(n)
        if(root == null){
            return new info(0, 0);
        }

        info leftInfo = diameter1(root.left);
        info rightInfo = diameter1(root.right);

        int diam = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.hight+rightInfo.hight+1);
        int ht = Math.max(leftInfo.hight, rightInfo.hight)+1;
        return new info(diam, ht);
    }

    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(6);

        System.out.println("sum "+sum(root));
        System.out.println("height "+hight(root));
       System.out.println("diameter "+ diameter(root));

       System.out.println(diameter1(root).diameter);
       System.out.println(diameter1(root).hight);

    }


}
