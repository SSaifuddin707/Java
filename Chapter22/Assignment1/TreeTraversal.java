package Chapter22.Assignment1;
/**
 * Created by Safeeullah Saifuddin
 * Tree Traversal using Stacks and Queues
 */


public class TreeTraversal {

    public static void main(String[] args) {
        Node root = null;
        Node aNode = new Node(1);
        aNode.right = new Node(3);
        Node dNode = new Node(4);
        Node cNode = new Node(2, dNode, new Node(5));
        aNode.left = cNode;

        root = aNode;

        System.out.println("In order stack traversal :");
        NodeUtilities.stackInOrder(root);

        System.out.println("Level order traversal: ");
        NodeUtilities.queueLeveltraversal(root);



    }

}
