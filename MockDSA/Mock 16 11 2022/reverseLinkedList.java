class reverseLinkedList{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    Node reverse(Node node){
        Node prev = null;
        Node curr = node;
        Node next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    void printList(Node node){
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
    public static void main(String[] args) {
        reverseLinkedList l = new reverseLinkedList();
        l.head = new Node(1);
        l.head.next = new Node(2);
        l.head.next.next = new Node(3);
        l.head.next.next.next = new Node(4);
        
        System.out.println("Bofore reverse Linked list");
        l.printList(head);
        head = l.reverse(head);
        System.out.println("After reversed linked list: ");
        l.printList(head);
    }
}

//1 2 3 4 5 = null
