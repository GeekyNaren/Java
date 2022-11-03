// 1
// 1 2 1
// 1 2 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 2 1
// 1 2 1
// 1
package Pattern;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking n value from the user
         
        System.out.println("How many n you want in this pattern?");
         
        int n = sc.nextInt();
         

        for (int i = 1; i <= n; i++) 
        {
            //Printing first half of the row
             
            for (int j = 1; j <= i; j++) 
            { 
                System.out.print(j+" "); 
            }
             
            //Printing second half of the row 
             
            for (int j = i-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) 
        {
            //Printing first half of the row
             
            for (int j = 1; j <= i; j++) 
            { 
                System.out.print(j+" "); 
            }
             
            //Printing second half of the row 
             
            for (int j = i-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
        //Closing the resources
         
        sc.close();
    }
}

