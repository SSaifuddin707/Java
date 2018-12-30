package Chapter20.Homework;
// Created by Safeeullah Saifuddin
// Chapter 20 Homework
// may need to remove package statement above header!!!!!

public class DoublyCircularlyLinkedList {
    Node head;
    int size;
    class Node{
        Node prev;
        Node next;
        double data;
        public Node(double data){
            this.data = data;
        }
    }
    public DoublyCircularlyLinkedList(){
        size = 0;
        head = null;
    }

    public static void main(String[] args) {
        DoublyCircularlyLinkedList dll = new DoublyCircularlyLinkedList();
        dll.add(1.2); // add node of value 1.2

        dll.add(2.2); // add node of value 2.2

        dll.add(3.2); // add node of value 3.2

        dll.add(4.2); // add node of value 4.2

        dll.add(0.2 , 0); // add node of value 0.2 at index 0

        dll.add(5.2,5); // add node of value 5.2 at index 5

        dll.remove(1.2); // remove node with value 1.2

        dll.remove(3); // remove node at index 3

        // try to add node out of bounds
        try{
            dll.add(100.2 , 100);
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Index must be greater than zero and less than or equal to size of list: " + dll.size());
        }



        System.out.println(dll.toString());
        System.out.println("Size of list is: " + dll.size());
    }

    /**
     * add a node to the end of the linked list
     * @param newData double value of new node's data
     */
    public void add(double newData){
        size++;
        Node newNode = new Node(newData);

        // check if list is empty
        if (isEmpty()){
            head = newNode;
            return;
        }

        Node current = head;
        // if list isn't empty then traverse to the end of the list
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    /**
     * add a node at a specific index
     * @param newData double value of ne node's data
     * @param index int value of index to be added at
     */
    public void add(double newData, int index){
        // check if index is out of bounds or at the end of list
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException();
        }else if (index == size || isEmpty()){
            add(newData);
            return;
        }
        // increment size
        size++;
        // if index is in bound, then traverse to index
        Node current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        Node nNode = new Node(newData);
        if (current == head){
            nNode.next = current;
            current.prev = nNode;
            head = nNode;
            return;
        }
        nNode.next = current;
        current.prev = nNode;
    }


    /**
     * remove a node whose value is given as argument
     * @param newData
     */
    public void remove(double newData){
        // check if empty
        if (isEmpty()){
            System.out.println("List is empty!");
            return;
        }
        // check if index is head
        if (head.data == newData){
            head = null;
        }
        // if not empty:
        // traverse to correct node
        size--;
        Node current = head;
        while (current != null){
            if (current.data == newData){
                current.prev.next = current.next;
                return;
            }else{
                current = current.next;
            }
        }
        System.out.println("No matching data found!");

    }

    /**
     * remove a node whose value is given as argument
     * @param index int value of node's index
     */
    public void remove(int index){
        // check if empty
        if (isEmpty()){
            System.out.println("List is empty!");
            return;
        }
        // decrement size
        size--;
        // check if index is head
        if (index == 0){
            head = null;
        }
        // if not traverse to index specified
        Node current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        // remove node
        current.prev.next = current.next;

    }
    /**
     * return true if the linked list is empty
     * @return boolean
     */
    public boolean isEmpty(){
        return head == null;
    }

    /**
     * return the number of nodes in the linked list
     * @return int
     */
    public int size(){
        return size;
    }

    /**
     * Custom toString method
     * @return
     */
    @Override
    public String toString() {
        String output = "[\n";
        Node current = head;
        while (current != null) {
            output += current.data+ " \n";
            current = current.next;
        }
        return output + "]";
    }
}
