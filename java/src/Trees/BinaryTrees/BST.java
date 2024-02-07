package Trees.BinaryTrees;

public class BST {

    public class Node{
        public boolean val;
        private int value;
        public Node left;
        public Node right;
        private int height;
        public Node(int value) {
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }

    private Node root;

    public BST(){

    }

    public int height(){
        return root.height;
    }
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEpmty(){
        return root == null;
    }

    public void inster(int value){
        root = inster(root,value);
    }

    public Node inster(Node node,int value){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = inster(node.left,value);
        }
        if(value > node.value){
            node.right = inster(node.right,value);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void populate(int[] nums){
        for (int i = 0; i <nums.length ; i++) {
            this.inster(nums[i]);
        }
    }
    public void populateSort(int[] nums){
         populateSort(nums,0,nums.length);
    }
    public void populateSort(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid = start + (end - start)/2;
        this.inster(nums[mid]);
        populateSort(nums,start,mid);
        populateSort(nums,mid+1,end);
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(this.root,"Root Node : ");
    }
    private void display(Node node,String detalis){
        if(node == null){
            return;
        }
        System.out.println(detalis + node.value);
        display(node.left,"Left child of "+node.value+" :");
        display(node.right,"Right child of "+node.value+" :");
    }
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
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

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value+" ");
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+" ");

    }


}
