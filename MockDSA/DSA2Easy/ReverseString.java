package MockDSA.DSA2Easy;

public class ReverseString {
    
    public static void main(String[] args) {
        String str = "Hello";
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.print(reverse);
    }
}
