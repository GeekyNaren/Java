package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class subarraySumK {
    static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap < Integer, Integer > hash = new HashMap < > ();
        int count = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == k) {
            count++;
            }
            if (hash.get(sum - k) != null) {
            count += hash.get(sum - k);
            }
            if (hash.get(sum) != null) {
            hash.put(sum, hash.get(sum) + 1);
            } else {
            hash.put(sum, 1);
            }
        }
        return count;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size: ");
    int size = sc.nextInt();
    int nums[] = new int[size];
    System.out.println("Enter arr ele: ");
    for(int i=0;i<size;i++){
        nums[i]=sc.nextInt();
    }
    System.out.println("Enter K");
    int k = sc.nextInt();
    System.out.println("Sub array sum: "+subarraySum(nums, k));

    sc.close();
  }
}