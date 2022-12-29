package Insertion;

import java.util.Scanner;

public class InsertionSort {

    public static int[] sortArray(int arr[], int arrSize) {
        for (int i = 0; i < arrSize - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }


    /* WE CAN ALSO USE THIS METHOD TO PRINT ARRAY */
    // public static void printArray(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:\t");
        int arrSize = sc.nextInt();
        System.out.print("Enter array elements:\t");
        int arr[] = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        /* OPTIONAL CODE WITH printArray method above */
        // int sortedArray[] = sortArray(arr, arrSize);
        // printArray(sortedArray);

        sortArray(arr, arrSize);
        System.out.print("Sorted array is:\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

/*
 * TIME COMPLEXITY OF INSERTION SORT ALGORITHM
 * WORST CASE: O(N^2)
 * BEST CASE: O(N) Its special about this algorithm
 */