package MockDSA.DSA2Easy;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        // if(str == reverse){ // can use this if also
        if(str.equals(reverse)){
            System.out.print(str+" is palindrome");
        }
        else{
            System.out.print(str+" is not palindrome");
        }
        sc.close();
    }
}
 