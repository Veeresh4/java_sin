// public class Fibonacci {
//     public static void main(String[] args) {
//         int n = 10, n1=0, n2=1, n3;
//         for(int i=1; i<=n; ++i) {
//             System.out.println(n1);
//             n3 = n1+n2;
//             n1=n2;
//             n2=n3;
//         }
//     }
// }


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int n1=0, n2=1, n3;
        for(int i=1; i<=n; ++i) {
            System.out.println(n1);
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }
    }
}


// public class Fibonacci {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter the number: ");
//         int n = sc.nextInt();
//         int n1=0, n2=1, n3, i=1;
//         while(i<=n) {
//             System.out.println(n1);
//             n3 = n1+n2;
//             n1 = n2;
//             n2 = n3;
//             i++;
//         }
//     }
// }
