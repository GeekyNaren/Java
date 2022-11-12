package LinkedList.SingleLinkedList;

import java.util.*;

public class LinkedListCollection {
    public static void main(String[] args) {
        // LinkedList<Integer> list = new LinkedList();
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("This");
        list.add("is");
        list.addLast("a");
        list.add("list");
        System.out.println(list+" and size is: "+list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
        
        list.removeFirst();
        System.out.println(list);
    }

}
