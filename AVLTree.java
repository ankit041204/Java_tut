public class AVLTree {

    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.height = 1; // new node height = 1
        }
    }

    // Get height
    static int height(Node root) {
        if (root == null) return 0;
        return root.height;
    }

    // Get balance factor
    static int getBalance(Node root) {
        if (root == null) return 0;
        return height(root.left) - height(root.right);
    }

    // Right Rotation (LL case)
    static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // rotation
        x.right = y;
        y.left = T2;

        // update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left Rotation (RR case)
    static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // rotation
        y.left = x;
        x.right = T2;

        // update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert
    static Node insert(Node root, int key) {
        // Step 1: Normal BST insert
        if (root == null)
            return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        else
            return root; // no duplicates

        // Step 2: Update height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // Step 3: Get balance factor
        int balance = getBalance(root);

        // Step 4: Rotations

        // LL Case
        if (balance > 1 && key < root.left.data)
            return rightRotate(root);

        // RR Case
        if (balance < -1 && key > root.right.data)
            return leftRotate(root);

        // LR Case
        if (balance > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // RL Case
        if (balance < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // Preorder traversal
    static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;

        int[] values = {40, 20, 10, 25, 30, 22, 50};

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Preorder Traversal of AVL Tree:");
        preorder(root);
    }
}