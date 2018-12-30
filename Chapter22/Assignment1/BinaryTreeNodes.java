package Chapter22.Assignment1;

public class BinaryTreeNodes {
    public static void main(String[] args) {
        Node root = null;
        Node aNode = new Node(10);
        aNode.left = new Node(20);
        Node dNode = new Node(40);
        Node cNode = new Node(30, dNode, new Node(50));
        aNode.right = cNode;

        Node rootNode = new Node(5);
        Node eNode = new Node(6, new Node(7), new Node(8));
        rootNode.left = aNode;
        rootNode.right = eNode;
        root = rootNode;

        System.out.println("inorder traversal is: ");
        NodeUtilities.inorder(root);
        System.out.println();
    }
}
