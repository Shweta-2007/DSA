package TREES;

public class EqualTreePartition {
    private static int totalSum = 0;
    private static boolean isPresent = false;

    public static int findSum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return node.val + findSum(node.left) + findSum(node.right);
    }

    public static int findSubTreeWithSum(int targetSum, TreeNode node) {
        if (node == null) {
            return 0;
        }
        int currentSum = node.val + findSubTreeWithSum(targetSum, node.left)
                + findSubTreeWithSum(targetSum, node.right);

        if (currentSum == targetSum) {
            isPresent = true;
        }

        return currentSum;
    }

    public static boolean equalSumTree(TreeNode node) {
        if (node == null) {
            return false;
        }
        totalSum = findSum(node);
        if (totalSum % 2 != 0) {
            return false;
        }
        findSubTreeWithSum(totalSum / 2, node);
        return isPresent;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        boolean ans = equalSumTree(root);
        System.out.println(ans);
    }
}
