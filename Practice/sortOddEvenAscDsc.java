import java.util.*;

/*
Sort the array in a way all odd numbers came first in ascending order and all even numbers came in descending order.
Input: {1 6 2 7 3 9 8 4}
Output: {1 3 7 9 8 6 4 2}

*/
public class sortOddEvenAscDsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        System.out.println("Enter a elements");
        int s[] = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        Arrays.sort(s);
        // Odd in ascending
        for (int j = 0; j < n; j++) {
            if (s[j] % 2 == 1) {
                System.out.print(s[j] + " ");
            }
        }
        // Even in descending
        for(int j = (n -1); j >= 0; j--) {
            if (s[j] % 2 == 0) {
                System.out.print(s[j] + " ");
            }
        }

        sc.close();
    }
    
}
