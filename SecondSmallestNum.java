import java.util.Arrays;

public class SecondSmallestNum {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        Arrays.sort(arr);
        if(arr.length>=2){
            int n = arr[1];
            System.out.println("Second smallest in array :" +n);
        }
    }
}
