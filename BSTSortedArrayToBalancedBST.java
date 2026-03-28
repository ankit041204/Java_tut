public class BSTSortedArrayToBalancedBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Function to convert sorted array to BST
    public static Node sortedArrayToBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        Node root = new Node(arr[mid]);

        // Left subtree
        root.left = sortedArrayToBST(arr, start, mid - 1);

        // Right subtree
        root.right = sortedArrayToBST(arr, mid + 1, end);

        return root;
    }

    // Inorder traversal (to verify BST)
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        Node root = sortedArrayToBST(arr, 0, arr.length - 1);

        // Print inorder (should be sorted)
        inorder(root);
    }
}