package Chapter21.Lab;
/**
 * Created by Safeeullah Saifuddin
 * Implementation of Stack using Queue
 */

public class QueueStack {
    private ArrayQueue stringQueue;
    private int size;

    public QueueStack(int capacity){
        size = 0;
        stringQueue = new ArrayQueue(capacity);     // using array queue from canvas
    }

    public static void main(String[] args) {
        QueueStack queueStack = new QueueStack(4); // create new QueueStack of capacity 4

        queueStack.push("FirstStack"); // add FirstStack to QueueStack
        queueStack.push("SecondStack"); // add SecondStack to QueueStack
        queueStack.push("ThirdStack"); // add ThirdStack to QueueStack
        queueStack.push("FourthStack"); // add FourthStack to QueueStack

        System.out.println("Peek stack:  " + queueStack.peek()); // Peek QueueStack --> returns top of stack which is First

        System.out.println("\nQueue Stack : \n" + queueStack.toString() + "\n"); // display QueueStack

        System.out.println("Remove first item in stack: " + queueStack.pop()); // remove first stack

        System.out.println("\nQueue Stack : \n" + queueStack.toString() + "\n"); // display QueueStack

    }

    /**
     * Adds item to stack
     * @param sString item to add to stack
     */
    public void push(String sString){
        // check if stack is full
        if (size == stringQueue.capacity()){
            System.out.println("Stack is full");
            return;
        }
        // create new queue to enqueue and dequeue values to
        ArrayQueue pushQueue = new ArrayQueue(stringQueue.capacity());
        // enqueue value you want to push
        pushQueue.enqueue(sString);
        // enqueue dequeued values
        for (int i = 0; i < size; i++){
            pushQueue.enqueue(stringQueue.dequeue());
        }

        size++; // increment size
        stringQueue = pushQueue;
    }

    /**
     * Removes and returns first item in stack
     * @return First item in queue
     */
    public String pop(){
        // check if stack is empty
        if (stringQueue.empty()){
            System.out.println("Stack is empty");
            return "";
        }

        size--; // decrement size
        return stringQueue.dequeue();
    }

    /**
     * Returns item at top of stack
     * No removal!
     * @return Top item in stack
     */
    public String peek(){
        return stringQueue.peek();
    }

    /**
     * toString method
     * @return Queue Stack
     */
    @Override
    public String toString() {
        return stringQueue.toString();
    }
}
