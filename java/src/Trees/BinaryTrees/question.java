package Trees.BinaryTrees;

import javax.swing.tree.TreeNode;
import java.util.*;

public class question {
    public static void main(String[] args) {

    }


//    leetcode - 102 // https://leetcode.com/problems/binary-tree-level-order-traversal/

//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        if(root == null){
//            return result;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            int levelSize = queue.size();
//            List<Integer> currentLevel = new ArrayList<>(levelSize);
//            for (int i = 0; i < levelSize; i++) {
//                TreeNode currentNode = queue.poll();
//                currentLevel.add(currentNode.val);
//                if(currentNode.left!=null){
//                    queue.offer(currentNode.left);
//                }
//                if(currentNode.right!=null){
//                    queue.offer(currentNode.right);
//                }
//            }
//            result.add(currentLevel);
//        }
//        return result;
//    }


//  leetcode - 637 // https://leetcode.com/problems/average-of-levels-in-binary-tree/


//    google asked Question - find the right of the current node by using or i have to know hoe to approch a question bfs

//    public TreeNode findScucesor(TreenNode root,int key){
//        if(root == null){
//            return null;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            int levelSize = queue.size();
//            TreeNode currentNode = queue.poll();
//            if(currentNode.left != null){
//                queue.offer(currentNode.left);
//            }
//            if(currentNode.right != null){
//                queue.offer(currentNode.right);
//            }
//            if(currentNode.val == key){
//                break;
//            }
//        }
//        return queue.peek();
//    }

    //      leetcode - 103 // https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        if (root == null) {
//            return result;
//        }
//        Deque<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        boolean reversed = false;
//        while (!queue.isEmpty()) {
//            int levelSize = queue.size();
//            List<Integer> currentLevel = new ArrayList<>(levelSize);
//            for (int i = 0; i < levelSize; i++) {
//                if(!reversed){
//                    TreeNode currentNode = queue.pollFirst();
//                    currentLevel.add(currentNode.val);
//                    if (currentNode.left != null) {
//                        queue.offerLast(currentNode.left);
//                    }
//                    if (currentNode.right != null) {
//                        queue.offerLast(currentNode.right);
//                    }
//                }else{
//                    TreeNode currentNode = queue.pollLast();
//                    currentLevel.add(currentNode.val);
//                    if (currentNode.right != null) {
//                        queue.offerFirst(currentNode.right);
//                    }
//                    if (currentNode.left != null) {
//                        queue.offerFirst(currentNode.left);
//                    }
//                }
//            }
//            reversed  = !reversed;
//            result.add(currentLevel);
//        }
//        return result;
//    }

//    leetcode - 116  //https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

//    public Node connect(Node root) {
//        if(root == null){
//            return null;
//        }
//        Node leftMost = root;
//
//        while (leftMost.left != null){
//            Node current = leftMost;
//            while(current != null){
//                current.left.next = current.right;
//                if(current.next != null){
//                    current.right.next = current.next.left;
//                }
//                current = current.next;
//            }
//            leftMost = leftMost.left;
//        }
//        return root;
//    }

//    leetcode - 199 //https://leetcode.com/problems/binary-tree-right-side-view/

//    public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        if(root == null){
//            return result;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            int levelSize = queue.size();
//            for (int i = 0; i < levelSize; i++) {
//                TreeNode currentNode = queue.poll();
//                if(i== levelSize-1){
//                    result.add(currentNode.val);
//                }
//                if(currentNode.left!=null){
//                    queue.offer(currentNode.left);
//                }
//                if(currentNode.right!=null){
//                    queue.offer(currentNode.right);
//                }
//            }
//        }
//        return result;
//    }

//    leetcode - 993  //https://leetcode.com/problems/cousins-in-binary-tree/

//    public boolean isCousins(TreeNode root, int x, int y) {
//        TreeNode xx = findNode(root, x);
//        TreeNode yy = findNode(root, y);
//
//        return (level(root,xx,0) == level(root,yy,0)) && (!isSibling(root,xx,yy));
//    }
//    public TreeNode findNode(TreeNode node , int x){
//        if(node == null){
//            return null;
//        }
//        if(node.val == x){
//            return node;
//        }
//        TreeNode n = findNode(node.left,x);
//        if(n != null){
//            return n;
//        }
//        return findNode(node.right,x);
//    }
//    public boolean isSibling(TreeNode node, TreeNode x, TreeNode y){
//        if(node == null){
//            return false;
//        }
//        return (node.left == x && node.right == y) || (node.left == y && node.right == x) ||
//                isSibling(node.left, x, y) || isSibling(node.right, x, y);
//    }
//    public int level(TreeNode node, TreeNode x , int lev) {
//        if(node == null){
//            return 0;
//        }
//        if(node == x){
//            return lev;
//        }
//        int l = level(node.left, x, lev+1);
//        if(l != 0){
//            return l;
//        }
//        return level(node.right,x,lev+1);
//    }

//    leetcode - 101 // https://leetcode.com/problems/symmetric-tree/

//    public boolean isSymmetric(TreeNode root) {
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root.left);
//        queue.add(root.right);
//
//        while(!queue.isEmpty()){
//            TreeNode left = queue.poll();
//            TreeNode right = queue.poll();
//
//            if(left == null && right == null){
//                continue;
//            }
//            if(left == null || right == null){
//                return false;
//            }
//            if(left.val != right.val){
//                return false;
//            }
//            queue.add(left.left);
//            queue.add(right.right);
//            queue.add(left.right);
//            queue.add(right.left);
//        }
//        return true;
//    }

//    leetcode - 543 //https://leetcode.com/problems/diameter-of-binary-tree/description/

//    int diameter = 0;
//    public int diameterOfBinaryTree(TreeNode root) {
//        height(root);
//        return diameter-1;
//    }
//    public int height(TreeNode node){
//        if(node == null){
//            return 0;
//        }
//        int left = height(node.left);
//        int right = height(node.right);
//
//        int dia = left + right + 1;
//        diameter = Math.max(dia,diameter);
//
//        return Math.max(left,right)+1;
//    }



//    leetcode - 104 // https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

//    public int maxDepth(TreeNode root) {
//        int h = height(root);
//        return h;
//    }
//    public int height(TreeNode node){
//        if(node == null){
//            return 0;
//        }
//        int left = height(node.left);
//        int right = height(node.right);
//
//        return Math.max(left,right) +1;
//    }

//    leetcode - 108 //https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

//    public TreeNode sortedArrayToBST(int[] nums) {
//        return help(nums, 0, nums.length-1);
//    }
//    public TreeNode help(int[] nums, int s, int e){
//        if(s>e){
//            return null;
//        }
//        int mid = s + (e - s)/2;
//        TreeNode node = new TreeNode(nums[mid]);
//        node.left = help(nums, s, mid-1);
//        node.right = help(nums, mid+1, e);
//        return node;
//    }

//    leetc - 404  //https://leetcode.com/problems/sum-of-left-leaves/

//    public int sumOfLeftLeaves(TreeNode root) {
//        return help(root);
//    }
//    public int help(TreeNode node){
//        if(node == null){
//            return 0;
//        }
//        int sum = 0;
//        if(node.left != null && node.left.left == null && node.left.right == null){
//            sum = node.left.val + sum;
//        }
//        sum += help(node.left);
//        sum += help(node.right);
//        return sum;
//    }

//    leetcode - 114 // https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/

//    public void flatten(TreeNode root) {
//        TreeNode current = root;
//        while(current != null){
//            if(current.left != null){
//                TreeNode temp = current.left;
//                while(temp.right!= null){
//                    temp = temp.right;
//                }
//                temp.right = current.right;
//                current.right = current.left;
//                current.left = null;
//            }
//            current = current.right;
//        }
//
//    }

//    leetcode - 98 //https://leetcode.com/problems/validate-binary-search-tree/description/

//    public boolean isValidBST(TreeNode root) {
//        return help(root, null, null);
//    }
//    public boolean help(TreeNode node, Integer low, Integer high){
//        if(node == null){
//            return true;
//        }
//        if(low != null && node.val <= low){
//            return false;
//        }
//        if(high != null && node.val >= high){
//            return false;
//        }
//        boolean left = help( node.left, low, node.val);
//        boolean right = help( node.right, node.val, high);
//
//        return left && right;
//    }

//    leetcode - 236 //https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/

//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root ==null){
//            return null;
//        }
//        if(root == p || root == q){
//            return root;
//        }
//        TreeNode left = lowestCommonAncestor(root.left, p ,q);
//        TreeNode right = lowestCommonAncestor(root.right, p ,q);
//
//        if(left != null && right != null){
//            return root;
//        }
//        return left == null ? right : left;
//
//    }


//    leetcode 230 //https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/

//    ArrayList<Integer> list = new ArrayList<>();
//    public int kthSmallest(TreeNode root, int k){
//        help(root);
//        return list.get(k-1);
//    }
//    public void help(TreeNode node){
//        if(node == null){
//            return;
//        }
//        help(node.left);
//        list.add(node.val);
//        help(node.right);
//    }

//    leetcode - 105 //https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/

//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        if(preorder.length == 0){
//            return null;
//        }
//        int r = preorder[0];
//        int index = 0;
//        for(int i =0;i<inorder.length;i++){
//            if(inorder[i]== r){
//                index = i;
//            }
//        }
//        TreeNode node = new TreeNode(r);
//        node.left = buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index+1));
//        node.right = buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
//
//        return node;
//    }

//    leetcode - 112 //https://leetcode.com/problems/path-sum/description/

//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if(root == null){
//            return false;
//        }
//        if(targetSum == root.val && root.left == null && root.right == null){
//            return true;
//        }
//        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
//     }

//    leetcode  - 124 //https://leetcode.com/problems/binary-tree-maximum-path-sum/description/

//    int ans = Integer.MIN_VALUE;
//    public int maxPathSum(TreeNode root) {
//        help(root);
//        return ans;
//    }

//    int help(TreeNode node){
//        if(node == null){
//            return 0;
//        }
//        int left = help(node.left);
//        int right = help(node.right);
//
//        left = Math.max(0, left);
//        right = Math.max(0, right);
//
//        int pathSum = left + right + node.val;
//
//        ans = Math.max(pathSum, ans);
//
//        return Math.max(left, right) + node.val;
//    }



//    finding the path in tree using arr;

//    boolean findPath(Node node, int[]  arr){
//        if(node == null){
//            return arr.length == 0;
//        }
//        return help(node , arr, 0);
//    }

//    boolean help(Node node, int[] arr, int index){
//        if(node == null){
//            return false;
//        }
//        if(index >= arr.length || node.val != arr[index]){
//            return false;
//        }
//        if(node.left == null && node. right == null && index == arr.length - 1){
//            return true;
//        }
//        return help(node.left, arr, index + 1) || help(node.right, arr, index+1);
//    }


//    count path in a binary tree anyhere in the with of the target sum;

//    public int pathCount(Node node, int sum){
//        LinkedList<Integer> path = new LinkedList<>();
//        return  helper(node, sum, path);
//    }
//    public int helper(Node node, int sum, LinkedList<Integer> path){
//        if(node == null) {
//            return 0;
//        }
//        path.add(node.val);
//        int count = 0;
//        int s = 0;
//
//        //how many path you can make
//
//        ListIterator<Integer> itr = path.listIterator(path.size());
//        while(itr.hasPrevious()){
//            s += itr.previous();
//            if(s == sum){
//                count++;
//            }
//        }
//        count += helper(node.left, sum, path) + helper(node.right, sum, path);
//
//        //backtrack
//        path.remove(path.size() -1);
//        return count;
//
//    }



//    DFS (depth first search) using stack


//    public static void dfs(Node node){
//        if(node == null){
//            return;
//        }
//        Stack<Node> st = new Stack<Node>();
//        st.push(node);
//        while (!st.isEmpty()){
//            Node remove = st.pop();
//            System.out.print(remove.val +" ");
//            if(remove.right != null){
//                st.push(remove.right);
//            }
//            if(remove.right != null) {
//                st.push(remove.right);
//            }
//        }
//
//    }

}
