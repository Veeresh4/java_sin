import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random rn = new Random();
        int x = rn.nextInt();
        System.out.println(x);
    }
}


// public class RandomNum {
//     public static void main(String[] args) {
//         int x = 1, y = 100;
//         double z = Math.random();
//         int num = (int)(z*(y-x))+x;
//         System.out.println(num);
//     }
// }