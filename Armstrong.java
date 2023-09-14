import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int sum = 0, temp = n;
        while(n>0) {
            int digit = n%10;
            sum = sum + digit*digit*digit;
            n/= 10;
        }
        if(temp == sum) {
            System.out.println("Number is armstrong");
        } else {
            System.out.println("Not an armstrong number");
        }
    }
}
