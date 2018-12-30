package Chapter22.Assignment2;

import java.util.ArrayList;
import java.util.List;

public class BSTDemo {
    private static List<Integer> sortedArray;

    public static void main(String[] args) {
        createArrayList();
        // get the middle index
        int middle = (sortedArray.size()-1) / 2;

        //set middle index as root of binaryTree
        BinarySearchTree BST = new BinarySearchTree();
        BST.add(sortedArray.get(middle));

        // remove index from array
        sortedArray.remove(middle);

        // add the rest of the array
        for (int i = 0; i < sortedArray.size(); i++){
            BST.add(sortedArray.get(i));
        }
        inorder(BST.root, "root: ");


    }

    private static void createArrayList() {
        sortedArray = new ArrayList<>();
        sortedArray.add(1);
        sortedArray.add(2);
        sortedArray.add(3);
        sortedArray.add(4);
        sortedArray.add(5);
        sortedArray.add(6);
        sortedArray.add(7);
    }

    static public void inorder(Node btree, String message){

        if (btree != null){
            inorder(btree.left, "left: ");
            System.out.print(message + btree.value + " ");
            inorder(btree.right, "right: ");
        }
    }
}
