import java.util.Scanner;

public class ImplementationBubbleSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
      }
    
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        System.out.print("Enter array elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
          arr[i] = sc.nextInt();
        }
        // bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
          for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
              // swap
              swapped = true;
              int temp = arr[j];
              arr[j] = arr[j + 1];
              arr[j + 1] = temp;
            }
          }
          if(!swapped){
            break;
          }
        }
        System.out.print("Sorted Array: ");
        printArray(arr);
        sc.close();
      }
}