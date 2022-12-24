package ArenaQuestions;

import java.util.Scanner;

public class CountZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ones = 0, zeros = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 1) {
                ones++;
            } else {
                zeros++;
            }
        }
        System.out.println(ones + " " + zeros);
    }
}