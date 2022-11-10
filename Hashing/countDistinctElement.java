import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Count distinct elements using SET

public class countDistinctElement {
    static int countDistinct(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int element:arr){
            set.add(element);
        }
        return set.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr size: ");
        int arrsize = sc.nextInt();
        int arr[] = new int[arrsize];
        System.out.print("Enter arr elements: ");
        for(int i=0;i<arrsize;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Distinct elements are: "+countDistinct(arr));
        sc.close();
    }
}
