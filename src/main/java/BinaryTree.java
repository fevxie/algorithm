import java.util.*;

public class BinaryTree{
    private BinaryTreeNode root;

    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public void preOrder(){
        if(root ==null){
            System.out.println("根节点为空");
        }

        root.preOder();
    }

    public void infixOrder(){
        if(root ==null){
            System.out.println("根节点为空");
        }
        this.root.infixOrder();
    }

    public void postOrder(){
        if(root ==null){
            System.out.println("根节点为空");
        }
        this.root.postOrder();
    }

    public static class BinaryTreeNode{
        private String data;
        private BinaryTreeNode left;
        private BinaryTreeNode right;

        public BinaryTreeNode(String data) {
            this.data = data;
        }

        public void preOder(){
            System.out.println(this);
            if(this.left != null){
                this.left.preOder();
            }
            if(this.right !=null){
                this.right.preOder();
            }
        }

        public void infixOrder(){
            if(this.left!=null){
                this.left.infixOrder();
            }
            System.out.println(this);
            if(this.right!=null){
                this.right.infixOrder();
            }
        }

        public void postOrder(){
            if(this.right !=null){
                this.right.postOrder();
            }
            if(this.left !=null){
                this.left.postOrder();
            }
            System.out.println(this);
        }
        /*
        * 广度遍历
        * */
        public void BoardOrder(BinaryTreeNode root){
            Queue<BinaryTreeNode> nodeQueue = new LinkedList<>();
            nodeQueue.add(root);
            while (!nodeQueue.isEmpty()){
                BinaryTreeNode node = nodeQueue.poll();
                if(node.left!=null){
                    nodeQueue.add(node.left);
                }
                if(node.right!=null){
                    nodeQueue.add(node.right);
                }
            }

            List<Integer> list = new ArrayList<>();


        }


        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public BinaryTreeNode getLeft() {
            return left;
        }

        public void setLeft(BinaryTreeNode left) {
            this.left = left;
        }

        public BinaryTreeNode getRight() {
            return right;
        }

        public void setRight(BinaryTreeNode right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "BinaryTreeNode{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }
}
