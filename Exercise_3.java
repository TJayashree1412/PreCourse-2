//time o(n) where n is the number of nodes
//space o(1) 
class LinkedList {
    Node head; // head of linked list

    /* Linked list node */
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Function to print middle of linked list */
    // Complete this function
    void printMiddle() {
        // Write your code here
        // Implement using Fast and slow pointers

        if (head == null)
            return;

        Node slow = head;
        Node fast = head;

        // while (pointer != null) {
        // count++;
        // pointer = pointer.next;
        // }
        // int middle = (count / 2) + 1;
        // pointer = head;
        // for (int i = middle - 1; i > 0; i--)
        // pointer = pointer.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);

    }

    // inserting new element at the start
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + "->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        for (int i = 15; i > 0; --i) {
            llist.push(i);
            llist.printList();
            llist.printMiddle();
        }
    }
}