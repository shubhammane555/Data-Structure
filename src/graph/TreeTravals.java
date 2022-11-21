
import java.util.Scanner;

 class Driver {
    static Scanner sc;

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        System.out.println("Hello, World!");
        Node root = createTree();
        inOrder(root);
    }

    static Node createTree() {
        Node root = null;
        System.out.println("Enter Data: ");
        int data = sc.nextInt();
        if (data == -1)
            return null;

        root = new Node(data);
        System.out.println("Enter left for" + data);
        root.left = createTree();
        System.out.println("Enter right for" + data);
        root.right = createTree();

        return root;
    }

    // In Order
    public static void inOrder(Node root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    // Pre Order
//    public static void preOrder(Node root) {
//        if (root == null)
//            return;
//        System.out.print(root.data + " ");
//        preOrder(root.left);
//        preOrder(root.right);
//    }

    // Post Order
//    public static void postOrder(Node root) {
//        if (root == null)
//            return;
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.print(root.data + " ");
//
//    }
}
 class Node {
	    int data;
	    Node left;
	    Node right;

	    public Node(int data) {
	        this.data = data;

	    }

	}
