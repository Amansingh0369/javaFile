package Trees.BinaryTrees;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){

    }
    public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value  = value;
        }
    }

    private Node root;

    public void populate(Scanner in){
        System.out.println("Enter the root node: ");
        int value = in.nextInt();
        root = new Node(value);
        populate(in,root);
    }
    private void populate(Scanner in, Node node){
        System.out.println("do you want to enter the left of " + node.value);
        boolean left = in.nextBoolean();
        if(left){
            System.out.println("enter the value of left of " + node.value);
            int value  = in.nextInt();
            node.left = new Node(value);
            populate(in,node.left);
        }
        System.out.println("do you want to enter the right of " + node.value);
        boolean right = in.nextBoolean();
        if(right){
            System.out.println("enter the value of right of " + node.value);
            int value  = in.nextInt();
            node.right = new Node(value);
            populate(in,node.right);
        }
    }

    void display(){
        display(root,"");
    }
    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,indent+"\t");
        display(node.right ,indent+"\t");
    }
    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    private void prettyDisplay(Node node,int level){
        if(node == null){
            return;
        }
        prettyDisplay(node.right,level+1);
        if(level!=0){
            for (int i = 0; i <level-1 ; i++) {
                System.out.println("|\t\t");
            }
            System.out.println("|------>"+node.value);
        }else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }



}
