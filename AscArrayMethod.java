import java.util.Arrays;

public class AscArrayMethod {
    public static void main(String[] args) {
        int arr[] = {4,5,2,1,9,7};
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
