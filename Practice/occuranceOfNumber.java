import java.util.Scanner;

public class occuranceOfNumber {
    /* Brute Force Approach TC O(n) and SC O(1)*/
    // static void findOccurance(int arr[], int x){
    //     int first = -1, last = -1;
    //     for(int i=0;i<arr.length;i++){
    //         if(x != arr[i])
    //             continue;
    //         if(first == -1)
    //             first = i;
    //         last = i;
    //     }
    //     if(first != -1){
    //         System.out.print("first and last occurances of " +x+ " are: ( "+first+" , "+last+" )");
    //     }
    // }


    /* Brute Force End */
    /* Binary Search */
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
        System.out.print("The first and last occurance of "+x+" is at index "+firstOcc(arr, 6, x)+" and "+lastOcc(arr, 6, x));

        sc.close();
    }
}