/* Reverse a linked list with O(1) Space Complexity & O(n) TC */
package LinkedList.SingleLinkedList;

public class ReverseLinkedlist {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //add fisr, last

        public void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
    
    //add last
    
        public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            
            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }

            currNode.next = newNode;
        }

    //print

        public void printList(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data+ " -> ");
                currNode = currNode.next;
            }
            System.out.println("NULL");
        }

    //delete node first 
        public void deleteFirst(){
            if(head == null){
                System.out.println("list is empty");
                return;
            }
            head = head.next;
        }
        
    //delete node last
    
    public void deleteLast(){
            if(head == null){
                System.out.println("list is empty");
                return;
            }
            if(head.next == null){
                head = null;
                return;
            }
            Node secondLast = head;
            Node lasNode = head.next;
            while(lasNode.next != null){
                lasNode = lasNode.next;
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }
    public static void main(String[] args) {
        SingleLL list = new SingleLL();
        list.addFirst(1);
        list.addFirst(2);
        list.printList();
        
        list.addLast(3);
        list.printList();

        list.addFirst(4);
        list.printList();

        list.deleteFirst();
        list.printList();

        // list.deleteLast();
        // list.printList();
    }
}
