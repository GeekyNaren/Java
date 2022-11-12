package LinkedList.SingleLinkedList;

public class ReverseListIterative {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node reverse(Node head){
        Node cur = head;
        Node prev = null;
        while(cur!=null){
            Node next = cur.next; 
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static void main(String[] args) {
       
    }
}
