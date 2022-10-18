import java.util.*;
public class PeakIndexInMountaInArray{
    static int findPeak(int arr[]){
        int s=0,e=arr.length-1;
        int mid = s + (e-s)/2;
        while(s<e){
            if(arr[mid]<arr[mid+1]){
                s = mid + 1;
            }
            else{
                e = mid;
            }
            mid = s + (e-s)/2;
        }
        return s;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,5,0,2};

        System.out.print(findPeak(arr));

        sc.close();
    }
    
}