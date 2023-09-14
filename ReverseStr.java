public class ReverseStr {
    public static void main(String[] args) {
        String str = "Veeresh";
        String revStr = "";
        for(int i=str.length()-1; i>=0; i--){
            revStr += str.charAt(i);
        }
        System.out.println("Original string :" +str);
        System.out.println("Reversed String :" +revStr);
    }
}


// public class ReverseStr {
//     public static void main(String[] args) {
//         String str = "veeresh";
//         for(int i=str.length()-1; i>=0; i--){
//             System.out.print(str.charAt(i));
//         }
//     }
// }