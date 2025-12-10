package LinkedLists.DLL;

public class basic {
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
    //array to DLL
    public Node arrayToDLL(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node curr = new Node(arr[i]);
            prev.next = curr;
            curr.prev = prev;
            prev = curr;
        }
        return head;
    }

    //DELETION IN DLL
    //Delete head
    public Node deleteHead(Node head){
        if(head == null || head.next == null){
            return null;
            }
        Node prev = head;
        head = head.next;
        head.prev = null;
        prev.next = null;
        return head;


    }

    //delete tail
    public Node deleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        prev= curr.prev;
        prev.next = null;
        curr.prev = null;
        return head;
    }

    //delete at position
    public Node deleteAtPosition(Node head, int pos){
        if(head == null){
            return null;
        }
        int count = 0;
        Node curr = head;
        while(curr!=null){
            count++;
            if(count == pos){
                break;
            }
            curr = curr.next;

        }
        Node prev=curr.prev;
        Node front=curr.next;

        if(prev==null && front==null){
            return null;
        }
        else if(prev==null){
            head=front;
            front.prev=null;
            curr.next=null;

        }
        else if(front==null){
            prev.next=null;
            curr.prev=null;

        }
        else{
            prev.next=front;
            front.prev=prev;
            curr.prev=null;
            curr.next=null;
        }

        
    }

    //delete by value
    public Node deleteByValue(Node head, int val){
        if(head == null){
            return null;
        }
        Node curr = head;
        while(curr!=null){
            if(curr.data == val){
                break;
            }
            curr = curr.next;
        }
        if(curr == null){
            return head;
        }
        Node prev=curr.prev;
        Node front=curr.next;
        if(prev==null && front==null){
            return null;
        }
        else if(prev==null){
            head=front;
            front.prev=null;
            curr.next=null;

        }
        else if(front==null){
            prev.next=null;
            curr.prev=null;

        }
        else{
            prev.next=front;
            front.prev=prev;
            curr.prev=null;
            curr.next=null;
        }
        return head;

    }

//INSERTION IN DLL

    //insert at head
    public Node insertAtHead(Node head, int val){
        Node newNode = new Node(val);
        if(head == null){
            return newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    }

    //insert at tail
    public Node insertAtTail(Node head, int val){
        Node newNode = new Node(val);
        if(head == null){
            return newNode;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
        return head;
    }
    //insert before tail
    public Node insertBeforeTail(Node head, int val){
        Node newNode = new Node(val);
        if(head == null || head.next == null){
            return insertAtHead(head, val);
        }
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        Node tail = curr.next;
        curr.next = newNode;
        newNode.prev = curr;
        newNode.next = tail;
        tail.prev = newNode;
        return head;
    }
    //insert before a node position
    public Node insertBeforePosition(Node head, int pos, int val){
        Node newNode = new Node(val);
        if(head == null){
            return newNode;
        }
        if(pos == 1){
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }
        int count = 0;
        Node curr = head;
        while(curr!=null){
            count++;
            if(count == pos){
                break;
            }
            curr = curr.next;
        }
        if(curr == null){
            return head;
        }
        Node prev=curr.prev;
        prev.next=newNode;
        newNode.prev=prev;
        newNode.next=curr;
        curr.prev=newNode;
        return head;

    }
    //insert before a node value
    public Node insertBeforeValue(Node head, int target, int val){
        Node newNode = new Node(val);
        if(head == null){
            return newNode;
        }
        if(head.data == target){
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }
        Node curr = head;
        while(curr!=null){
            if(curr.data == target){
                break;
            }
            curr = curr.next;
        }
        if(curr == null){
            return head;
        }
        Node prev=curr.prev;
        prev.next=newNode;
        newNode.prev=prev; 
        newNode.next=curr;
        curr.prev=newNode;
        return head;
    }


     
 


}
