public class RevWordStr {
    public static void main(String[] args) {
        String str = "hello world";
        String word[] = str.split(" ");
        String revStr = " ";
        for(int i=word.length-1; i>=0; i--){
            revStr = revStr + word[i];
            if(i>0){
                revStr += " ";
            }
        }
        System.out.println(str);
        System.out.println(revStr);
    }
}
