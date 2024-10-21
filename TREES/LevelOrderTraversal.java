package TREES;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return Integer.toString(val);
    }
}

public class LevelOrderTraversal {
    public static void LevelOrderTraversalHelper(TreeNode node) {
        if (node == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode rn = queue.remove();
                System.out.print(rn.val + " ");
                if (rn.left != null) {
                    queue.add(rn.left);
                }
                if (rn.right != null) {
                    queue.add(rn.right);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        LevelOrderTraversalHelper(root);
    }
}