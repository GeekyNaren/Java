package Searching.Binary;

import java.util.Scanner;

public class searchInRoatedSortedArray {
    static int getPivot(int arr[], int n){
        int s =0;
        int e = n-1;
        int mid = s + (e-s) / 2;
        while(s<e){
            if(arr[mid]>=arr[0]){
                s = mid + 1;
            }
            else{
                e = mid;
            }
            mid = s + (e-s) / 2;
        }
        return s;
    }

    static int binarySearch(int arr[], int s, int e, int target)
    {
        int start = s;
        int end = e;
        int mid = start + (end-start)/2;
        while(start<=end)
        {
        if(arr[mid]==target)
        {
            return mid;
        }
        if(target>=arr[mid])
        {
            start = mid+1;
        }
        else
        {
            end = mid-1;
        }
        mid = start + (end - start)/2;
        }
        return -1;
    }

    static int findPosition(int arr[], int n, int target){
        int pivot = getPivot(arr, n);
        if(target >= arr[pivot] && target <= arr[n-1]){ //second line
            return binarySearch(arr, pivot, n-1, target);
        }
        else{//first line
            return binarySearch(arr, 0, pivot-1, target);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target to search in rotated sorted array: ");
        int target = sc.nextInt();
        System.out.print(target + " target found at index: " + findPosition(arr, n, target));
        sc.close();
    }
}
