import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class cal1 {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        private void Node(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) { return null; }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

    // preorder
    static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // inorder
    static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);
        }
    }

    // postorder
    static void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val+" ");
        }
    }

    public static void main(String[] args) {
        cal1 cc = new cal1();
        TreeNode Node1 = new TreeNode();
        TreeNode Node2 = new TreeNode();
        TreeNode Node3 = new TreeNode();
        TreeNode Node4 = new TreeNode();
        TreeNode Node5 = new TreeNode();
        TreeNode Node6 = new TreeNode();
        TreeNode Node7 = new TreeNode();
        Node1.Node(11, Node2, Node3);
        Node2.Node(22, null, null);
        Node3.Node(33, Node4, Node5);
        Node4.Node(44, null, null);
        Node5.Node(55, Node6, Node7);
        Node6.Node(66, null, null);
        Node7.Node(77, null, null);
        System.out.println("PreOrder:");
        cal1.preOrder(Node1);
        System.out.println();
        System.out.println("Invert:");
        cal1.invertTree(Node1);
        cal1.preOrder(Node1);
        System.out.println();
        System.out.println("inOrder:");
        cal1.inOrder(Node1);
        System.out.println();
        System.out.println("postOrder:");
        cal1.postOrder(Node1);

    }
}



