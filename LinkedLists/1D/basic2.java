package LinkedLists.1D;

public class basic2 {
    //DELETION AND INSERTION IN LINKEDLIST 
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    //DELETIONS
    //delete head
    Node deleteHead(Node head){
        if(head == null) return null;
        return head.next;
    }
    //delete tail
    Node deleteTail(Node head){
        if(head == null || head.next == null) return null;
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        return head;
    }

    //delete at position
    Node deletebyposition(Node head, int position){
        if(head ==null) return null;
        if(position == 1) return head.next;
        Node current = head;
        int count =1;
        Node previous = null;
        while(current !=null){
            count++;
            if(count == position){
                previous.next =current.next;
                break;

            }
            previous = current;
            current = current.next;
        
        }
    }
    //dlete by value
    Node deletebyvalue(Node head, int value){
        if(head == null) return null;
        if(head.data == value) return head.next;
        Node current = head;
        Node previous = null;
        while(current != null){
            if(current.data == value){
                previous.next = current.next;
                break;

            }
            previous = current;
            current = current.next;
        }
        return head;
    }
    




}
