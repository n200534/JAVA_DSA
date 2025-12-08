package LinkedLists.1D;

public class basic {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    //array to linkedlist 
    public static Node arrayToLinkedList(int[] arr){
        if(arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node current = head;

        for(int i = 1; i < arr.length; i++){
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

    //traverse linkedlist
    public static void traverse(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    //length of the linkedlist
    public static int length(Node head){
        int count = 0;
        Node current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return couwnt;
    }

    //search in the lnkedlist
    public static boolean search(Node head, int key){
        Node current = head;
        while(current != null){
            if(current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }




    
}
