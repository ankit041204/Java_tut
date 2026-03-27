public class ValidateBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Function to validate BST
    public static boolean isValidBST(Node root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }

        // Check current node value with range
        if ((min != null && root.data <= min) || 
            (max != null && root.data >= max)) {
            return false;
        }

        // Check left and right subtree
        return isValidBST(root.left, min, root.data) &&
               isValidBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        /*
                 5
                / \
               3   7
              / \   \
             2   4   8
        */

        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(8);

        System.out.println(isValidBST(root, null, null)); // true
    }
}