import java.util.Scanner;

public class FindTotalOcc {
    static int firstOcc(int arr[], int n, int key){
        int s=0, e=n-1;
        int mid = s  +(e-s)/2;
        int ans = -1;
        while(s<=e){
            if(arr[mid]==key){
                ans = mid;
                e = mid - 1;
            }
            if(key > arr[mid]){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
            mid = s + (e-s)/2;
        }
        return ans; 
    }

    static int lastOcc(int arr[], int n, int key){
        int s=0, e=n-1;
        int mid = s  +(e-s)/2;
        int ans = -1;
        while(s<=e){
            if(arr[mid]==key){
                ans = mid;
                s = mid + 1;
            }
            if(key > arr[mid]){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
            mid = s + (e-s)/2;
        }
        return ans; 
    }

    /* Binary Search End */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,3,4,4,5};
        System.out.print("Your array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter a key to find first and last index of it: ");
        int x = sc.nextInt();
        int firstIndex = firstOcc(arr, 6, x);
        int lastIndex = lastOcc(arr, 6, x);
        int total = (firstIndex-lastIndex)+1;
        System.out.print("The total occurance of "+x+" is "+total);

        sc.close();
    }
}