package Searching.Binary.leetcode;

import java.util.Scanner;

public class searchInRotatedSortedArray {   
    
    public static int search(int[] nums, int target) {
            int start=0, end=nums.length-1;
            int mid = start + (end-start)/2;
            while(start<=end){
            if(nums[mid] == target) return mid;
            
            if((nums[start] == nums[mid] ) && (nums[end] == nums[mid])){
                start++; end--;
                }
            
            else if(nums[start] <= nums[mid])
            {
                if((nums[start] <= target) && (nums[mid] > target)) end = mid-1;
                else start = mid + 1;
            }
            else
            {
                if((nums[mid] < target) && (nums[end] >= target)) start = mid+1;
                else end = mid - 1;
            }
            mid = start + (end-start)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target to search: ");
        int target = sc.nextInt();
        System.out.print(target+" target found at index "+search(nums, target));
        sc.close();
    }
}