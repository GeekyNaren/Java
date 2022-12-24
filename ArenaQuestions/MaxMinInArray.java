package ArenaQuestions;

import java.util.Scanner;

public class MaxMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = arr[0];
            int min = arr[0];
            for (int i = 1; i < n; i++) {
                max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
            }
            System.out.println(max + " " + min);
        }
    }
}