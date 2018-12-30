package Chapter21.Lab;
/**
 * Created by Safeeullah Saifuddin
 * Implementation of queue using stack
 */

import java.util.Stack;

/**
 * enqueue
 * dequeue
 * peek
 * empty
 */
public class StackQueue {
    private int size;
    private int front;
    private int rear;
    private Stack<String> stringStack;

    public StackQueue() {
        size = 0;
        stringStack = new Stack<>();
    }

    public static void main(String[] args) {
        StackQueue stackQueue = new StackQueue();
        if (stackQueue.isEmpty()) System.out.println("Stack queue is empty!");
        stackQueue.enqueue("FirstQ");
        stackQueue.enqueue("SecondQ");

        System.out.println("Peek queue: " + stackQueue.peek());

        stackQueue.enqueue("ThirdQ");
        stackQueue.enqueue("FourthQ");
        stackQueue.enqueue("FifthQ");

        System.out.println("\nStack Queue: \n" + stackQueue.toString());
        System.out.println();

        stackQueue.dequeue();       // remove Fifth Queue
        stackQueue.enqueue("NewFifthQ");

        System.out.println("\nStack Queue: \n" +stackQueue.toString());

    }

    /**
     * Checks if queue is empty
     *
     * @return boolean flag if empty or not
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Adds object to queues using stack's push() method
     *
     * @param qString object to be added
     */
    public void enqueue(String qString) {
        size++;

        stringStack.push(qString);
        System.out.println(qString + " enqueued");
    }

    /**
     * Removes item from queue
     */
    public void dequeue() {
        // check if queue is empty
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }


        // pop elements to intermediate stack (exclude last element)
        Stack<String> tempStack = new Stack<>();
        for (int i = 0; i < size ; i++){
            tempStack.push(stringStack.pop());
        }
        size--;
        // pop elements back
        for (int i = 0; i < size; i++){
            stringStack.push(tempStack.pop());
        }

        System.out.println(stringStack.peek() + " dequeued");

    }

    /**
     * Returns values of first element in queue
     * @return
     */
    public String peek(){

        return stringStack.peek();
    }

    @Override
    public String toString() {
        return stringStack.toString();
    }
}
