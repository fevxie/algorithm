import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void testBinaryTree(){
        //创建节点与二叉树
        BinaryTree.BinaryTreeNode node1 = new BinaryTree.BinaryTreeNode("root");
        BinaryTree.BinaryTreeNode node2 = new BinaryTree.BinaryTreeNode("left");
        BinaryTree.BinaryTreeNode node3 = new BinaryTree.BinaryTreeNode("right1");
        BinaryTree.BinaryTreeNode node4 = new BinaryTree.BinaryTreeNode("right2");

        node1.setLeft(node2);
        node1.setRight(node3);
        node3.setRight(node4);

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(node1);

        System.out.println("前序遍历");
        binaryTree.preOrder();
        System.out.println("中序遍历");
        binaryTree.infixOrder();
        System.out.println("后续遍历");
        binaryTree.postOrder();

    }
}
