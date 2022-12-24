package MockDSA.DSA2Easy;
// 1 2 3 4 5 
public class middleOfLL {
    // Node class
    static class Node {
      int data;
      Node next;
  
      // Constructor to create a new node
      Node(int data) {
        this.data = data;
        this.next = null;
      }
    }
  
    static Node head;  // head of the linked list
  
    // Method to find the middle element of the linked list
    static int getMiddleElement() {
      Node slowPointer = head;
      Node fastPointer = head;
  
      while (fastPointer != null && fastPointer.next != null) {
        slowPointer = slowPointer.next;
        fastPointer = fastPointer.next.next;
      }
  
      return slowPointer.data;
    }
  
    // Method to insert a new node at the end of the linked list
    static void insert(int data) {
      Node newNode = new Node(data);
      newNode.next = null;
  
      if (head == null) {
        head = newNode;
        return;
      }
  
      Node last = head;
      while (last.next != null) {
        last = last.next;
      }
  
      last.next = newNode;
    }
  
    public static void main(String[] args) {
      // Insert elements into the linked list
      insert(1);
      insert(2);
      insert(3);
      insert(4);
      insert(5);
  
      // Find and print the middle element of the linked list
      System.out.println("The middle element is: " + getMiddleElement());
    }
  }
  
