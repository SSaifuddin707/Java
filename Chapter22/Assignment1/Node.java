package Chapter22.Assignment1;

public class Node {
    int value;
     Node left, right;

    public Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
