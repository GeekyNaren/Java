package MockDSA.DSA2Easy;
// 1 2 3 4 5 
public class middleOfLL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int n){
            this.data = n;
            this.next = null;
        }
    }

    static void findMiddle(Node n){
        if(n==null){
            return;
        }
        Node slowPtr = n;
        Node fastPtr = n;

        while(fastPtr!=null && fastPtr.next != null){
            fastPtr = fastPtr.next;
            slowPtr = slowPtr.next;
        }
        System.out.println(slowPtr.data);
    }
    public static void main(String[] args) {
        middleOfLL list = new middleOfLL();
        Node node = new Node(1);
        list.node.next.next = new Node(2);
        node.next.next.next = new Node(3);
        findMiddle(node);
    }
}
