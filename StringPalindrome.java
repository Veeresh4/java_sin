import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :");
        String s = sc.nextLine();
        String reversed = "";
        for(int i=s.length()-1; i>=0; i--) {
            reversed = reversed + s.charAt(i);
        }
        if (s.equals(reversed)){
            System.out.println("String is palindrome");
        } else{
            System.out.println("String is not plaindrome");
        }
    }
}
