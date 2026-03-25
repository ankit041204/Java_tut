public class BSTPrintInRange {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Function to print values in range [k1, k2]
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        // If current node is in range
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        // If current node is greater than k1
        else if (root.data > k1) {
            printInRange(root.left, k1, k2);
        }
        // If current node is less than k2
        else {
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        /*
              8
             / \
            5   10
           / \    \
          3   6    11
        */

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        int k1 = 5, k2 = 10;

        System.out.print("Nodes in range: ");
        printInRange(root, k1, k2);
    }
}