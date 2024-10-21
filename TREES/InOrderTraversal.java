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
}

public class InOrderTraversal {

    public static List<Integer> traverse(TreeNode A) {
        List<Integer> result = new ArrayList<>();
        inOrderHelper(A, result);
        return result;
    }

    public static void inOrderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inOrderHelper(node.left, result);
        result.add(node.val);
        inOrderHelper(node.right, result);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer> result = traverse(root);
        System.out.println(result);
    }
}