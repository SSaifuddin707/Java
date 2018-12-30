package Chapter22.Assignment1;

import java.util.Stack;

public class NodeUtilities {
    static public void inorder(Node btree){

        if (btree != null){
            inorder(btree.left);;
            System.out.print(btree.value + " ");
            inorder(btree.right);
        }
    }

    static public void stackInOrder(Node root){
        // create empty stack
        Stack S = new Stack();
        // make root as current node
        Node current = root;
        // loop while current is not null
        while (current != null) {
            // push current to stack
            S.push(current);
            // set current to left child of itself
            current = current.left;
            // loop while current is null and stack is not empty
            while (current == null && !S.empty()) {
                // set current as node popped form stack
                current = (Node) S.pop();
                // print out value of current node
                System.out.print(current.value + " ");
                // set current as right child of itself
                current = current.right;
            }
        }
        System.out.println();
    }

    static public void queueLeveltraversal(Node root){
        // create empty queue
        ArrayQueue queue = new ArrayQueue(5);
        // enqueue root
        queue.enqueue(root);
        // loop while queue is not empty
        while (!queue.empty()){
            try{
                // save dequeue node
                Node current = queue.dequeue();
                // print out value of dequeued node
                System.out.print(current.value + " ");
                // enqueue left child
                queue.enqueue(current.left);
                // enqueue right child
                queue.enqueue(current.right);

            } catch (QueueOverFlowException e){
                // catch exception for end of queue
                System.out.println("\nEnd of queue");
            }catch (NullPointerException e){

            }

        }
    }
}
