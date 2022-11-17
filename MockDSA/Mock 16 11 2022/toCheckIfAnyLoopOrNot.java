import java.util.*;
public class toCheckIfAnyLoopOrNot {
    public static void main(String[] args) {
        // toCheckIfAnyLoopOrNot l = new toCheckIfAnyLoopOrNot();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        if(list.getLast() != null){
            System.out.println("loop");
        }
        else{
            System.out.println("No Loop");
        }
    }
}
