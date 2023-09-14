import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        int sum = 0, temp = n;
        while(n>0){
            int digit = n%10;
            sum = sum*10 + digit;
            n/= 10;
        }
        if(temp == sum){
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Not a palindrome number");
        }
    }       
}