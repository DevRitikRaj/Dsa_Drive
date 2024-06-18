
public class LinkList {

    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    public static Node head;
    public static Node tail;

    // Add the data in the linkedlist, we make the methods to add the data on the first
    public void addFirst(int data) {

        // Create the node ---Step 1
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2
        newNode.next = head;

        //step 3
        head = newNode;

    }

    // Add the data in the last node to the tail.
    public void lastAdd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    

    public void print() {
        if (head == null) {
            System.out.println("Linkedlist is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        LinkList ll=new LinkList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.lastAdd(3);
        ll.print();
        ll.lastAdd(4);
        ll.print();

        
    }
}