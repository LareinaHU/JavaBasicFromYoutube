import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode_BinaryTree {
    static class Node {
        public Object data;
        public Node left;
        public Node right;

        public void Node(Object data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    // preorder
    void preSearch(Node root) {
        if (root != null) {
            System.out.printf("%-4s", root.data);
            preSearch(root.left);
            preSearch(root.right);
        }
    }

    // inorder
    void midSearch(Node root) {
        if (root != null) {
            midSearch(root.left);
            System.out.printf("%-4s", root.data);
            midSearch(root.right);
        }
    }

    // postorder
    void bacSearch(Node root) {
        if (root != null) {
            bacSearch(root.left);
            bacSearch(root.right);
            System.out.printf("%-4s", root.data);
        }
    }

    public static void main(String[] args) {
        leetcode_BinaryTree b = new leetcode_BinaryTree();
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();
        node1.Node("11", node2, node3);
        node2.Node("22", null, null);
        node3.Node("33", node4, node5);
        node4.Node("44", null, null);
        node5.Node("55", null, null);
//        Node node10 = new Node();
//        node10.Node("10", null, null);
//        Node node9 = new Node();
//        node9.Node("9", null, null);
//        Node node8 = new Node();
//        node8.Node("8", null, null);
//        Node node7 = new Node();
//        node7.Node("7", null, null);
//        Node node6 = new Node();
//        node6.Node("6", null, null);
//        Node node5 = new Node();
//        node5.Node("5", node10, null);
//        Node node4 = new Node();
//        node4.Node("4", node8, node9);
//        Node node3 = new Node();
//        node3.Node("3", node6, node7);
//        Node node2 = new Node();
//        node2.Node("2", node4, node5);
//        Node node1 = new Node();
//        node1.Node("1", node2, node3);
//        leetcode_BinaryTree b = new leetcode_BinaryTree();
//        //对所构造的二叉树遍历输出
        System.out.println("preorder：");
        b.preSearch(node1);
        System.out.println();
        System.out.println("inorder：");
        b.midSearch(node1);
        System.out.println();
        System.out.println("postorder：");
        b.bacSearch(node1);
    }
}

