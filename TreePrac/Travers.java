package TreePrac;

import java.util.LinkedList;
import java.util.Queue;

import Recurrsion.removeDuplicate;
import example.bear;

public class Travers {
    
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


        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void postorder(Node root){
            if(root==null){
                return;
            }
            
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data+" ");
        }

        public static void Inorder(Node root){
            if(root==null){
                return;
            }
            
            preorder(root.left);
            System.out.print(root.data+" ");
            preorder(root.right);
            
        }

        public static void levelOrder(Node root){
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int height(Node root){

            //nodes base height 
            //if u want to find height on the basis of edges then substract -1 from ans
            if(root == null){
                return 0;
            }

            int lh = height(root.left);
            int rh = height(root.right);

            int maxHeight = Math.max(lh, rh)+1;

            return maxHeight;
        }

        public static int diameter(Node root){ //O(n^2);
            if(root == null){
                return 0;
            }

            int leftDiam = diameter(root.left);
            int leftHeight = height(root.left);
            int rightDiam = diameter(root.right);
            int rightHeight = height(root.right);

            int selfDiam = leftHeight+rightDiam+1;

            return Math.max(Math.max(leftDiam,rightDiam),selfDiam);
        }

        static class Info {
            int diam;
            int ht;
    
             Info(int dima, int ht){
                this.diam = dima;
                this.ht = ht;
             }
            
        }

        public static Info diameterOptimal(Node root){ //O(n)

            if(root == null){
                return new Info(0, 0);
            }

            Info leftInfo = diameterOptimal(root.left);
            Info rightInfo = diameterOptimal(root.right);

            int dima =  Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

            return new Info(dima, ht);

        }

        //calculate total nodes in the tree
        public static int totalNodes(Node root){

            //nodes base height 
            //if u want to find height on the basis of edges then substract -1 from ans
            if(root == null){
                return 0;
            }

            int lc = totalNodes(root.left);
            int rc = totalNodes(root.right);

            return  lc + rc + 1;
        }
    }

    

    public static void main(String args[]){

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);
        // tree.preorder(root);
        // System.out.println();
        // tree.postorder(root);
        // System.out.println();
        // tree.Inorder(root);
        // System.out.println();
        // tree.levelOrder(root);
        // System.out.println();
        // System.out.println(tree.height(root));
        // System.out.println(tree.totalNodes(root));
        //System.out.println(tree.diameter(root));
        System.out.println(tree.diameterOptimal(root).diam);
    } 
}
