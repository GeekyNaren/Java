package ArenaQuestions;

import java.util.Scanner;

public class NegativeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean hasNegative = false;
        for (int i : arr) {
            if (i < 0) {
                hasNegative = true;
                break;
            }
        }
        if (hasNegative) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
