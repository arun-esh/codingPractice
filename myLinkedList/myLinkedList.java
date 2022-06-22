class myLinkedList {
    private Node head;
    private int length;

    public myLinkedList() {
        this.length = 0;
    }


    // Getter and Setter for Length Node
    public int getSize(){
        return length;
    }

    // push the element to the LinkedList
    public void push(int data) {
        Node newNode = new Node(data);
        Node currentNode = head;
        if (isEmpty()) {
            head = newNode;
        } else {
            while(currentNode.getNext() != null){
                System.out.println("length: " + length);
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }

        length++;
        System.out.println("length: " + length);
    }

    // Add Element to the front of the list
    public void addToFront(int data){
        Node newNode = new Node(data);
        length++;
        if(!isEmpty()){
            newNode.setNext(head);
        }
        head = newNode;
        System.out.println("length: " + length);
    }

    // Remove from the front

    public void removeFromFront(){
        if(isEmpty()){
            System.out.println("Empty List.");
        }
        else{
            if(getSize() == 1){
                head = null;
            }else{
                head = head.getNext();
            }
        }
        length--;
    }

    // Check if Empty

    public Boolean isEmpty(){
        if(length == 0) return true;
        return false;
    }

    // print the LinkedList

    public void printList() {
        if(isEmpty()){
            System.out.println("Empty List");
        }else{
            Node currentNode = head;
            System.out.print("HEAD:-> ");
            for (int i = 0; i < length; i++) {
                if (currentNode != null) {
                    System.out.print(currentNode.getData() + " ");
                }
                currentNode = currentNode.getNext();
            }
            System.out.println();
        }
    }
}
