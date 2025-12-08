package LinkedLists.1D;

public class insertions {
    //INSERTONS

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //insert at head
    Node insertAtHead(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    //insert at tail
    Node insertAtTail(Node head, int data){
        Node newNode = new Node(data);
        if(head == null) return newNode;
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    //insert at position
    Node insertAtPosition(Node head, int data, int position){
        Node newNode = new Node(data);

        if(head == null){
            return newNode;
        }
        if(position == 1){
            newNode.next = head;
            return newNode;
        }
        Node current = head;
        int count =0;
        while(current != null){
            count++;

            if(count == (position-1)){
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
            

        }
        return head;
    }
    

    //insert before the value
    Node insertBeforeValue(Node head, int data, int value) {
    Node newNode = new Node(data);

    // Case 1: empty list
    if (head == null) return newNode;

    // Case 2: insert before head
    if (head.data == value) {
        newNode.next = head;
        return newNode;
    }

    Node current = head;
    Node previous = null;

    while (current != null) {

        // When we find the value
        if (current.data == value) {
            previous.next = newNode;
            newNode.next = current;
            return head;
        }

        // Move pointers
        previous = current;
        current = current.next;
    }

    // value not found → no insertion
    return head;
}



}
