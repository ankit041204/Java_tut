import java.util.*;

public class BSTRootToLeafPath{

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Function to print all root to leaf paths
    public static void printPaths(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        // Add current node to path
        path.add(root.data);

        // If leaf node → print path
        if (root.left == null && root.right == null) {
            System.out.println(path);
        } else {
            // Traverse left and right
            printPaths(root.left, path);
            printPaths(root.right, path);
        }

        // Backtrack (remove last element)
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        /*
                 1
                / \
               2   3
              / \   \
             4   5   6
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        printPaths(root, new ArrayList<>());
    }
}