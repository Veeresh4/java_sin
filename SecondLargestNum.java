import java.util.Arrays;

public class SecondLargestNum {
    public static void main(String[] args) {
        int arr[] = {2,5,7,1,8,6};
        Arrays.sort(arr);
        if(arr.length>=2){
            int n = arr[arr.length-2];
            System.out.println("Second Largest number :" +n);
        } 
    }   
}
