import java.util.*;

public class BinaryTreesSubtreeOfAnothertree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Function to check if two trees are identical
    public static boolean isIdentical(Node root, Node subRoot) {
        // both null → true
        if (root == null && subRoot == null) {
            return true;
        }

        // one null or data mismatch → false
        if (root == null || subRoot == null || root.data != subRoot.data) {
            return false;
        }

        // check left & right
        return isIdentical(root.left, subRoot.left) &&
               isIdentical(root.right, subRoot.right);
    }

    // Main function to check subtree
    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }

        // check at current node
        if (isIdentical(root, subRoot)) {
            return true;
        }

        // check left or right
        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {

        // Main tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Subtree
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot)); // true
    }
}