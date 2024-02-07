package Trees.BinaryTrees;

import Trees.AVL.AVL;

import java.util.Scanner;

public class main extends AVL{
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(in);
//        tree.prettyDisplay();

//        BST tree = new BST();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
//        tree.populate(arr);
//        tree.display();
//        tree.preOrder();
//        tree.inOrder();
//        tree.postOrder();

//        BST tree = new BST();
//        tree.populate(arr);
//        tree.prettyDisplay();
        AVL tre = new AVL();
        for (int i = 1; i <=10; i++) {
            tre.insert(i);
        }
        System.out.println();
        System.out.println();
        tre.prettyDisplay();

    }
}
