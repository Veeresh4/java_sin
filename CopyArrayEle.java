public class CopyArrayEle {
    public static void main(String[] args) {
        int arr1[] = {12,15,45,16,11};
        int arr2[] = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }
        System.out.println("Destination array");
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
