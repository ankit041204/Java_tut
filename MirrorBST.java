public class MirrorBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Function to mirror the BST
    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }

        // Mirror left and right subtrees
        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);

        // Swap
        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    // Inorder traversal to check result
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        /*
                 4
                / \
               2   6
              / \ / \
             1  3 5  7
        */

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        System.out.print("Original Inorder: ");
        inorder(root);

        mirror(root);

        System.out.print("\nMirrored Inorder: ");
        inorder(root);
    }
}