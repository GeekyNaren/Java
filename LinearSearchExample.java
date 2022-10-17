import java.util.*;

public class LinearSearchExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.print(key+" found at index : "+i);
                return;
            }
        }
        System.out.print(key+" Not Found");
        sc.close();
    }    
}