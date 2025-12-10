package LinkedLists.DLL;

public class reverse {
    //Double Linked List
    class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;

        }
    }
    Node reverseDLL(Node head) {
    if (head == null || head.next == null) return head;

    Node current = head;
    Node prevNode = null;

    while (current != null) {
        // Swap next and prev pointers
        prevNode = current.prev;
        current.prev = current.next;
        current.next = prevNode;

        // Move to next node (which is current.prev after swapping)
        current = current.prev;
    }

    // prevNode is now pointing to the previous pointer of old head,
    // so the new head is prevNode.prev
    return prevNode.prev;
}



    
}
