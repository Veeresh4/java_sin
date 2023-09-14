public class SmallestArrayEle {
    public static void main(String[] args) {
        int arr[] = {1,2,5,7,8,9};
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min)
            min = arr[i];
        }
        System.out.print("Smallest element :" +min);
    }
}
