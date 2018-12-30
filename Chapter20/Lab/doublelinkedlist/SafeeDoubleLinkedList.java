package Chapter20.Lab.doublelinkedlist;

/**
 * Created by Safeeullah Saifuddin
 * Custom implemented double linked list
 */
public class SafeeDoubleLinkedList {
    Node head;
    static int counter;

    class Node {
        Node next;
        Node prev;
        Gamer gamerObject;

        public Node(Gamer gamer) {
            this.gamerObject = gamer;
        }
    }

    public SafeeDoubleLinkedList() {
        head = null;
        counter = 0;

    }

    public static void main(String[] args) {
        // Adds list of players
        SafeeDoubleLinkedList dll = new SafeeDoubleLinkedList();
        dll.insertSort(new Gamer("Lily", 112));
        dll.insertSort(new Gamer("Safee", 10));
        dll.insertSort(new Gamer("Joe", 25));
        dll.insertSort(new Gamer("Mike", 12));
        dll.insertSort(new Gamer("Gavin", 48));
        dll.insertSort(new Gamer("Luther", 100));
        dll.insertSort(new Gamer("Kevin", 50));
        dll.insertSort(new Gamer("Joe", 3));
        dll.insertSort(new Gamer("Captain", 98));
        dll.insertSort(new Gamer("Junior", 600));
        dll.insertSort(new Gamer("Daredevil", 666));
        dll.insertSort(new Gamer("RemoveUserTest", 2));

        System.out.println("List before removal: \n" + dll.toString());
        // shorten list to 10 values
        while (counter > 10) {
            dll.removeLast();
            counter--;
        }
        System.out.println("List after removal: \n" + dll.toString());
        System.out.println(counter);
    }

    /**
     * Inserts node after given node
     *
     * @param prevNode
     * @param insertGamer
     */
    public void insertAfter(Node prevNode, Gamer insertGamer) {
        // check is previous node is null
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }
//        Node newNode = new Node(insertGamer);
//        prevNode.next = newNode;
//

        // allocate new node
        Node newNode = new Node(insertGamer);

        // make new node's next as previous node's next node
        newNode.next = prevNode.next;
        // set nodes in correct place
        prevNode.next = newNode;
        newNode.prev = prevNode;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    /**
     * Inserts new node before given node
     *
     * @param prevNode
     * @param insertGamer
     */
    public void insertBefore(Node prevNode, Gamer insertGamer) {
        // check if previous node is null
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }
        // checks if previous node is head. If true then head will be set to new node
        if (prevNode == head) {
            Node newNode = new Node(insertGamer);
            prevNode.prev = newNode;
            newNode.next = prevNode;
            head = newNode;
            return;
        }

        // create new node
        Node newNode = new Node(insertGamer);
        // save value of prevNode.prev
        newNode.prev = prevNode.prev;
        // set new node in correct place
        prevNode.prev = newNode;
        newNode.next = prevNode;

        if (newNode.prev != null) {
            newNode.prev.next = newNode;
        }

    }

    /**
     * Inserts node in correct place
     *
     * @param insertGamer
     */
    public void insertSort(Gamer insertGamer) {
        counter++;
        // check if list is empty
        if (head == null) {
            Node current = new Node(insertGamer);
            head = current;
            return;
        }
        // if list is not empty
        // loop from head and insert value at correct place
        Node current = head;
        while (current != null) {
            if (current.gamerObject.getScore() < insertGamer.getScore()) {
                insertBefore(current, insertGamer);
                break;
            } else if (current.next != null) {
                if (current.gamerObject.getScore() < insertGamer.getScore() && insertGamer.getScore() < current.next.gamerObject.getScore()) {
                    insertBefore(current, insertGamer);
                    break;
                } else {
                    current = current.next;
                }
            } else {
                insertAfter(current, insertGamer);
                break;
            }
        }


    }

    /**
     * Removes last node
     */
    public void removeLast() {
        // traverse to last node
        Node current = head;
        // check if list is empty
        if (current != null) {
            while (current.next != null) {
                System.out.println(current.gamerObject.getScore());
                current = current.next;
            }
            // remove node
            current.prev.next = current.next;
        }

    }

    /**
     * Custom toString method
     * @return
     */
    @Override
    public String toString() {
        String output = "[\n";
        Node current = head;
        System.out.println("tos"
        );
        while (current != null) {
            output += current.gamerObject.getName() + " " + current.gamerObject.getScore() + "\n";
            current = current.next;
        }
        return output + "]";
    }
}
