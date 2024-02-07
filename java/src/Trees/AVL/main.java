package Trees.AVL;

public class main  extends AVL{
    public static void main(String[] args) {
        AVL tree = new AVL();
        for(int i = 1 ; i <= 10;i++){
            tree.insert(i);
        }
//        System.out.println(tree.height());
        tree.prettyDisplay();
    }
}
