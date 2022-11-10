import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class intersectionOfTwoArrays {
    static int intersect(int a[],int b[]){
        int count=0;
        Set<Integer> set = new HashSet<>();
        for(int x:a){
            set.add(x);
        }
        for(int x:b){
            if(set.contains(x)){
                count++;
                set.remove(x);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Array one
        System.out.print("Enter arr size a: ");
        int arrsize1 = sc.nextInt();
        int a[] = new int[arrsize1];
        System.out.print("Enter arr elements of a[]: ");
        for(int i=0;i<arrsize1;i++){
            a[i] = sc.nextInt();
        }

        //Array two
        System.out.print("Enter arr size b: ");
        int arrsize2 = sc.nextInt();
        int b[] = new int[arrsize2];
        System.out.print("Enter arr elements of b[]: ");
        for(int i=0;i<arrsize2;i++){
            b[i] = sc.nextInt();
        }

        //Union of two arrays
        System.out.println("Intersect of two arrays: "+intersect(a, b));
        sc.close();
    }
}
