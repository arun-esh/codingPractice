class myLinkedList {
  private Node head;
  private Node tail;
  private int length;

  public myLinkedList () {
    this.length = 0;
    this.head = null;
    this.tail = null;
  }

  // push the element to the LinkedList
  public void push (int data) {
    Node newNode = new Node(data);
    if(this.head == null){
      head = newNode;  
    }
    else {
      this.tail.next = newNode;
    }
  }
}