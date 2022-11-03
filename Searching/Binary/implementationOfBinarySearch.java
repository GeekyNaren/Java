package Searching.Binary;

import java.util.Scanner;

public class implementationOfBinarySearch {
    static int binarySearch(int arr[], int n, int k)
  {
    int start = 0;
    int end = arr.length-1;
    int mid = start + (end-start)/2;
    while(start<=end)
    {
      if(arr[mid]==k)
      {
        return mid;
      }
      if(k>=arr[mid])
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
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int n = sc.nextInt();
    System.out.print("Enter array elements: ");
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter element to search: ");
    int k = sc.nextInt();
    int index = binarySearch(arr,n,k);
    System.out.print("Element "+k+" found at index "+index);
    sc.close();
  }
}