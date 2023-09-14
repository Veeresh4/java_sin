import java.util.Arrays;
import java.util.Collections;

public class DesArrayMethod {
    public static void main(String[] args) {
        Integer arr[] = {2, 8, 9, 4, 6, 7, 1};
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

