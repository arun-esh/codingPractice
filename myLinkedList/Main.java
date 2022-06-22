public class Main {
    public static void main(String[] args) {

        myLinkedList myList = new myLinkedList();

        
        myList.push(84);
        myList.push(94);

        myList.printList();

        myList.addToFront(55);
        myList.push(34);
        myList.push(64);
        
        myList.printList();

        myList.removeFromFront();
        myList.printList();
    }
    
}
