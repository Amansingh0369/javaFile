package Trees;

import java.util.*;
public class ruftree {
    public static class tree {
        public static class Node{
            int val;
            Node left;
            Node right;
            public Node(int val){
                this.val = val;
            }
        }
        public tree(){}
        public static Node root;

        public  void insert(int val){
            root = insert(root,val);
        };
        public static Node insert(Node node, int val){
            if(node == null){
                node = new Node(val);
                return node;
            }
            if(node.val > val){
                node.left = insert(node.left, val);
            }
            if(node.val < val){
                node.right = insert(node.right, val);
            }
            return node;
        }
        public static void main(String[] args) {
            Scanner in  = new Scanner(System.in);
            int n = in.nextInt();
            tree t = new tree();
            for (int i = 0; i < n; i++) {
                t.insert(in.nextInt());
            }
            RightView(root);

        }
        public static int  height(Node node){
            if(node == null){
                return 0;
            }
            int left = height(node.left) + 1;
            int right = height(node.right) + 1;
            return Math.max(left,right);
        }
        static void RightView(Node root){
            if (root==null)
                return;
            System.out.print(root.val + " ");
            RightView(root.left);
        }
        public static void leafNode(Node node){
            if(node == null){
                return;
            }
            if(node.left == null && node.right == null){
                System.out.print(node.val +" ");
            }
            leafNode(node.left);
            leafNode(node.right);
        }

    }

}