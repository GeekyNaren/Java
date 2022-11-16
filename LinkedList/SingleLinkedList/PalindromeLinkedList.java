package LinkedList.SingleLinkedList;

public class PalindromeLinkedList {
    Node head;
    public class Node {
             int val;
             Node next;
             Node() {}
             Node(int val) { 
                this.val = val; 
            }
            Node(int val, Node next) { 
                this.val = val; this.next = next; 
            }
    }

    //add fisr, last

    public void first(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

//add last

    // public void addLast(int data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     }
        
    //     Node currNode = head;
    //     while(currNode.next != null){
    //         currNode = currNode.next;
    //     }

    //     currNode.next = newNode;
    // }

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node getMiddle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean isPalindrome(Node head) {
        if(head == null || head.next == null) {
            return true;
        }        
        Node firstHalfEnd = getMiddle(head);
        Node secondHalfStart = reverse(firstHalfEnd.next);
        Node firstHalfStart = head;
        
        while(secondHalfStart != null) {
            if(secondHalfStart.val != firstHalfStart.val) {
                return false;
            }
            secondHalfStart = secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;
        }        
        return true;
    }
    public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();
        list.first(1);
        list.first(2);        
        list.first(3);

        list.reverse(list.head);
        list.getMiddle(list.head);
        list.isPalindrome(list.head);
        System.out.println("Given linked list is "+list.isPalindrome(list.head));
    }
}
