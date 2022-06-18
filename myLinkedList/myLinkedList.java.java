class Node {
    int data;
    Node next;

    public Node() {
        this.data = 0;
    }

    public Node(int data) {
        this.data = data;
    }
}

class myLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public myLinkedList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    // push the element to the LinkedList
    public void push(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            head = newNode;
        } else {
            this.tail.next = newNode;
        }

        length++;
        tail = newNode;
    }

    // print the LinkedList

    public void printList() {
        Node dummyNode = head;
        for (int i = 0; i < length; i++) {
            if (dummyNode != null) {
                System.out.print(dummyNode.data + " ");
            }
            System.out.println();
        }
    }
}
