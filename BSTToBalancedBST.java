import java.util.*;

public class BSTToBalancedBST{

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Step 1: Store inorder traversal
    public static void getInorder(Node root, ArrayList<Integer> list) {
        if (root == null) return;

        getInorder(root.left, list);
        list.add(root.data);
        getInorder(root.right, list);
    }

    // Step 2: Convert sorted array to balanced BST
    public static Node createBST(ArrayList<Integer> list, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        Node root = new Node(list.get(mid));

        root.left = createBST(list, start, mid - 1);
        root.right = createBST(list, mid + 1, end);

        return root;
    }

    // Main function
    public static Node balanceBST(Node root) {
        ArrayList<Integer> list = new ArrayList<>();

        // Step 1
        getInorder(root, list);

        // Step 2
        return createBST(list, 0, list.size() - 1);
    }

    // Preorder traversal (to check structure)
    public static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        // Example: Unbalanced BST
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        // Convert to balanced BST
        root = balanceBST(root);

        // Print preorder
        preorder(root);
    }
}